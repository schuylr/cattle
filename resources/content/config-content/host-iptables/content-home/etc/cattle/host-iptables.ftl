*nat

:CATTLE_PREROUTING -
:CATTLE_POSTROUTING -

-F CATTLE_PREROUTING
-F CATTLE_POSTROUTING

<#if ipAssociations?? >
    <#list ipAssociations as assoc >
-A CATTLE_PREROUTING -m state --state NEW -d ${assoc.ipAddress.address} -j DNAT --to ${assoc.targetIpAddress.address}
-A CATTLE_POSTROUTING -m state --state NEW -s ${assoc.targetIpAddress.address} ! -d ${assoc.subnet.networkAddress}/${assoc.subnet.cidrSize} -j SNAT --to ${assoc.ipAddress.address}
    </#list>
</#if>

<#if ports?? >
    <#list ports as mapping>
        <#if (mapping.publicIpAddress.address)?? && (mapping.privateIpAddress.address)?? && (mapping.port.publicPort)?? && (mapping.port.privatePort)?? >
            <#-- This is a hack because IPsec traffic must go to the Docker IP and not the Cattle IP -->
            <#if mapping.port.publicPort != 500 && mapping.port.publicPort != 4500 >
-A CATTLE_PREROUTING -p ${mapping.port.protocol} -m addrtype --dst-type LOCAL --dport ${mapping.port.publicPort} -j DNAT --to ${mapping.privateIpAddress.address}:${mapping.port.privatePort}
            </#if>
        </#if>
    </#list>
</#if>

<#assign previous = "" >
<#list routes as route>
    <#if route.hostNatGatewayService?? && (route.subnet.gateway)?? && previous != route.subnet.networkAddress >
        <#assign previous = route.subnet.networkAddress >
-A CATTLE_POSTROUTING -s ${route.subnet.networkAddress}/${route.subnet.cidrSize} -d 169.254.169.250/32 -j ACCEPT
-A CATTLE_POSTROUTING -p tcp -s ${route.subnet.networkAddress}/${route.subnet.cidrSize} ! -d ${route.subnet.networkAddress}/${route.subnet.cidrSize} -j MASQUERADE --to-ports 1024-65535
-A CATTLE_POSTROUTING -p udp -s ${route.subnet.networkAddress}/${route.subnet.cidrSize} ! -d ${route.subnet.networkAddress}/${route.subnet.cidrSize} -j MASQUERADE --to-ports 1024-65535
-A CATTLE_POSTROUTING -s ${route.subnet.networkAddress}/${route.subnet.cidrSize} ! -d ${route.subnet.networkAddress}/${route.subnet.cidrSize} -j MASQUERADE
    </#if>
</#list>

<#list metadataRedirects as redirect >
-A CATTLE_PREROUTING -s ${redirect.subnet.networkAddress}/${redirect.subnet.cidrSize} -d 169.254.169.254 -j DNAT --to ${redirect.ipAddress.address}
-A CATTLE_PREROUTING -s ${redirect.subnet.networkAddress}/${redirect.subnet.cidrSize} -d 169.254.169.250 -j DNAT --to ${redirect.ipAddress.address}
</#list>

#POSTRULES

COMMIT
