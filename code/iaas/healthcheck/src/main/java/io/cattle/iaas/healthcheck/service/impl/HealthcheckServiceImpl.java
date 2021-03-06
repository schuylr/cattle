package io.cattle.iaas.healthcheck.service.impl;

import static io.cattle.platform.core.constants.HealthcheckConstants.HEALTH_STATE_HEALTHY;
import static io.cattle.platform.core.constants.HealthcheckConstants.HEALTH_STATE_UNHEALTHY;
import static io.cattle.platform.core.model.tables.HealthcheckInstanceHostMapTable.HEALTHCHECK_INSTANCE_HOST_MAP;
import static io.cattle.platform.core.model.tables.HealthcheckInstanceTable.HEALTHCHECK_INSTANCE;
import io.cattle.iaas.healthcheck.service.HealthcheckService;
import io.cattle.platform.allocator.dao.AllocatorDao;
import io.cattle.platform.core.constants.CommonStatesConstants;
import io.cattle.platform.core.constants.HealthcheckConstants;
import io.cattle.platform.core.constants.NetworkConstants;
import io.cattle.platform.core.constants.NetworkServiceConstants;
import io.cattle.platform.core.dao.GenericMapDao;
import io.cattle.platform.core.dao.GenericResourceDao;
import io.cattle.platform.core.dao.HostDao;
import io.cattle.platform.core.dao.NetworkDao;
import io.cattle.platform.core.model.HealthcheckInstance;
import io.cattle.platform.core.model.HealthcheckInstanceHostMap;
import io.cattle.platform.core.model.Host;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.InstanceHostMap;
import io.cattle.platform.core.model.Network;
import io.cattle.platform.lock.LockCallbackNoReturn;
import io.cattle.platform.lock.LockManager;
import io.cattle.platform.object.ObjectManager;
import io.cattle.platform.object.meta.ObjectMetaDataManager;
import io.cattle.platform.object.process.ObjectProcessManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.TransformerUtils;

public class HealthcheckServiceImpl implements HealthcheckService {
    
    @Inject
    GenericMapDao mapDao;
    
    @Inject
    ObjectManager objectManager;

    @Inject
    GenericResourceDao resourceDao;

    @Inject
    ObjectProcessManager objectProcessManager;

    @Inject
    LockManager lockManager;

    @Inject
    AllocatorDao allocatorDao;

    @Inject
    HostDao hostDao;

    @Inject
    NetworkDao ntwkDao;

    @Override
    public void updateHealthcheck(String healthcheckInstanceHostMapUuid, final long externalTimestamp, final boolean healthy) {
        HealthcheckInstanceHostMap hcihm = objectManager.findOne(HealthcheckInstanceHostMap.class,
                ObjectMetaDataManager.UUID_FIELD, healthcheckInstanceHostMapUuid);

        if (!shouldUpdate(hcihm, externalTimestamp, healthy)) {
            return;
        }

        final HealthcheckInstanceHostMap updatedHcihm = objectManager.setFields(hcihm,
                HEALTHCHECK_INSTANCE_HOST_MAP.EXTERNAL_TIMESTAMP, externalTimestamp,
                HEALTHCHECK_INSTANCE_HOST_MAP.HEALTH_STATE, healthy ? HEALTH_STATE_HEALTHY : HEALTH_STATE_UNHEALTHY);

        lockManager.lock(new HealthcheckInstanceLock(hcihm.getHealthcheckInstanceId()), new LockCallbackNoReturn() {
            @Override
            public void doWithLockNoResult() {
                processHealthcheckInstance(updatedHcihm, externalTimestamp, healthy);
            }
        });
    }

    protected void processHealthcheckInstance(HealthcheckInstanceHostMap hcihm, long externalTimestamp, boolean healthy) {
        HealthcheckInstance hcInstance = objectManager.loadResource(HealthcheckInstance.class, hcihm.getHealthcheckInstanceId());
        Boolean updateHealthy = determineNewHealthState(hcInstance, hcihm, externalTimestamp, healthy);
        if (updateHealthy == null) {
            return;
        }

        updateHealthcheckInstance(hcInstance, updateHealthy);
    }

    protected boolean shouldUpdate(HealthcheckInstanceHostMap hcihm, long externalTimestamp, boolean healthy) {
        HealthcheckInstance hcInstance = objectManager.loadResource(HealthcheckInstance.class,
                hcihm.getHealthcheckInstanceId());
        if (!healthy && getHealthState(hcInstance).equalsIgnoreCase(HealthcheckConstants.HEALTH_STATE_INITIALIZING)) {
            return false;
        }

        if (hcihm.getExternalTimestamp() == null) {
            return true;
        }

        if (externalTimestamp < hcihm.getExternalTimestamp()) {
            return false;
        }

        return true;
    }

    protected Boolean determineNewHealthState(HealthcheckInstance hcInstance, HealthcheckInstanceHostMap hcihm, long externalTimestamp, boolean healthy) {
        List<HealthcheckInstanceHostMap> others = objectManager.find(HealthcheckInstanceHostMap.class,
                HEALTHCHECK_INSTANCE_HOST_MAP.HEALTHCHECK_INSTANCE_ID, hcInstance.getId(),
                HEALTHCHECK_INSTANCE_HOST_MAP.STATE, CommonStatesConstants.ACTIVE);

        boolean currentlyHealthy = HEALTH_STATE_HEALTHY.equals(getHealthState(hcInstance));

        if (healthy) {
            return currentlyHealthy ? null : true;
        } else {
            if (!currentlyHealthy) {
                return null;
            }

            boolean allUnHealthy = true;
            for (HealthcheckInstanceHostMap map : others) {
                if (map.getId().equals(hcihm.getId())) {
                    continue;
                }

                if (!HEALTH_STATE_UNHEALTHY.equals(map.getHealthState())) {
                    allUnHealthy = false;
                    break;
                }
            }

            return allUnHealthy ? false : null;
        }
    }

    protected String getHealthState(HealthcheckInstance hcInstance) {
        Instance instance = objectManager.loadResource(Instance.class, hcInstance.getInstanceId());

        return instance == null ? null : instance.getHealthState();
    }

    protected void updateHealthcheckInstance(HealthcheckInstance hcInstance, boolean healthy) {
        Instance instance = objectManager.loadResource(Instance.class, hcInstance.getInstanceId());
        if (instance != null) {
            if (healthy) {
                objectProcessManager.scheduleProcessInstance("instance.updatehealthy", instance, null);
            } else {
                objectProcessManager.scheduleProcessInstance("instance.updateunhealthy", instance, null);
            }
        }
    }

    @Override
    public void registerForHealtcheck(final HealthcheckInstanceType instanceType, final long id) {
        final Long accountId = getAccountId(instanceType, id);
        if (accountId == null) {
            return;
        }
        
        lockManager.lock(new HealthcheckRegisterLock(id, instanceType), new LockCallbackNoReturn() {
            @Override
            public void doWithLockNoResult() {
                // 1. create healthcheckInstance mapping
                HealthcheckInstance healthInstance = createHealtcheckInstance(id, accountId);

                // 2. create healtcheckInstance to hosts mappings
                createHealthCheckHostMaps(instanceType, id, accountId, healthInstance);
            }
        });
    }

    protected HealthcheckInstance createHealtcheckInstance(long id, Long accountId) {
        HealthcheckInstance healthInstance = objectManager.findAny(HealthcheckInstance.class,
                HEALTHCHECK_INSTANCE.ACCOUNT_ID, accountId,
                HEALTHCHECK_INSTANCE.INSTANCE_ID, id,
                HEALTHCHECK_INSTANCE.REMOVED, null);
        
        if (healthInstance == null) {
            healthInstance = resourceDao.createAndSchedule(HealthcheckInstance.class,
                    HEALTHCHECK_INSTANCE.ACCOUNT_ID, accountId,
                    HEALTHCHECK_INSTANCE.INSTANCE_ID, id);
        }
        return healthInstance;
    }

    protected void createHealthCheckHostMaps(HealthcheckInstanceType instanceType, long id, Long accountId,
            HealthcheckInstance healthInstance) {
        Long inferiorHostId = getInstanceHostId(instanceType, id);
        List<Long> healthCheckHostIds = getHealthCheckHostIds(healthInstance, inferiorHostId);
        for (Long healthCheckHostId : healthCheckHostIds) {
            HealthcheckInstanceHostMap healthHostMap = mapDao.findNonRemoved(HealthcheckInstanceHostMap.class,
                    Host.class, healthCheckHostId, HealthcheckInstance.class,
                    healthInstance.getId());
            Long instanceId = (instanceType == HealthcheckInstanceType.INSTANCE ? id : null);
            if (healthHostMap == null) {
                resourceDao.createAndSchedule(HealthcheckInstanceHostMap.class, HEALTHCHECK_INSTANCE_HOST_MAP.HOST_ID,
                        healthCheckHostId,
                        HEALTHCHECK_INSTANCE_HOST_MAP.HEALTHCHECK_INSTANCE_ID, healthInstance.getId(),
                        HEALTHCHECK_INSTANCE_HOST_MAP.ACCOUNT_ID,
                        accountId,
                        HEALTHCHECK_INSTANCE_HOST_MAP.INSTANCE_ID, instanceId);
            }
        }
    }


    @SuppressWarnings("unchecked")
    private List<Long> getHealthCheckHostIds(HealthcheckInstance healthInstance, Long inferiorHostId) {
        int requiredNumber = 3;

        List<? extends HealthcheckInstanceHostMap> existingHostMaps = mapDao.findNonRemoved(
                HealthcheckInstanceHostMap.class,
                HealthcheckInstance.class, healthInstance.getId());
        List<? extends Host> availableActiveHosts = getActiveHostsProvidingHealthChecks(healthInstance);
        
        List<Long> availableActiveHostIds = (List<Long>) CollectionUtils.collect(availableActiveHosts,
                TransformerUtils.invokerTransformer("getId"));
        List<Long> allocatedActiveHostIds = (List<Long>) CollectionUtils.collect(existingHostMaps,
                TransformerUtils.invokerTransformer("getHostId"));

        // skip the host that if not active (being removed, reconnecting, etc)
        Iterator<Long> it = allocatedActiveHostIds.iterator();
        while (it.hasNext()) {
            Long allocatedHostId = it.next();
            if (!availableActiveHostIds.contains(allocatedHostId)) {
                it.remove();
            }
        }

        // return if allocated active hosts is >= required number of hosts for healtcheck
        if (allocatedActiveHostIds.size() >= requiredNumber) {
            return new ArrayList<>();
        }

        // remove allocated hosts from the available hostIds and shuffle the list to randomize the choice
        availableActiveHostIds.removeAll(allocatedActiveHostIds);
        requiredNumber = requiredNumber - allocatedActiveHostIds.size();
        Collections.shuffle(availableActiveHostIds);

        // place inferiorHostId to the end of the list
        if (inferiorHostId != null) {
            if (availableActiveHostIds.contains(inferiorHostId)) {
                availableActiveHostIds.remove(inferiorHostId);
                if (availableActiveHostIds.isEmpty() && allocatedActiveHostIds.isEmpty()) {
                    availableActiveHostIds.add(inferiorHostId);
                }
            }
        }

        // Figure out the final number of hosts
        int returnedNumber = requiredNumber > availableActiveHostIds.size() ? availableActiveHostIds.size() : requiredNumber;

        return availableActiveHostIds.subList(0, returnedNumber);
    }

    protected List<? extends Host> getActiveHostsProvidingHealthChecks(HealthcheckInstance healthInstance) {
        List<? extends Host> availableActiveHosts = allocatorDao.getActiveHosts(healthInstance.getAccountId());
        
        Iterator<? extends Host> it = availableActiveHosts.iterator();
        while (it.hasNext()) {
            Host host = it.next();
            Network ntwk = ntwkDao.getNetworkForObject(host, NetworkConstants.KIND_HOSTONLY);
            if (hostDao.isServiceSupportedOnHost(host.getId(), ntwk.getId(), NetworkServiceConstants.KIND_HEALTH_CHECK)) {
                continue;
            }
            it.remove();
        }
        return availableActiveHosts;
    }

    private Long getInstanceHostId(HealthcheckInstanceType type, long instanceId) {
        if (type == HealthcheckInstanceType.INSTANCE) {
            List<? extends InstanceHostMap> maps = mapDao.findNonRemoved(InstanceHostMap.class, Instance.class,
                    instanceId);
            if (!maps.isEmpty()) {
                return maps.get(0).getHostId();
            }
        }
        return null;
    }

    private Long getAccountId(HealthcheckInstanceType type, long instanceId) {
        if (type == HealthcheckInstanceType.INSTANCE) {
            Instance instance = objectManager.loadResource(Instance.class, instanceId);
            if (instance != null) {
                return instance.getAccountId();
            }
        }
        return null;
    }
}
