/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "instance", schema = "dstack")
public class Instance implements io.github.ibuildthecloud.dstack.db.jooq.generated.model.Instance {

	private static final long serialVersionUID = 756374342;

	private final java.lang.Long               id;
	private final java.lang.String             name;
	private final java.lang.String             kind;
	private final java.lang.Long               accountId;
	private final java.lang.String             uuid;
	private final java.lang.String             description;
	private final java.lang.String             requestedState;
	private final java.lang.String             state;
	private final java.lang.String             allocationState;
	private final java.lang.String             postComputeState;
	private final java.lang.Long               imageId;
	private final java.lang.Long               offeringId;
	private final java.lang.Long               requestedOfferingId;
	private final java.lang.String             onCrash;
	private final java.lang.String             hostname;
	private final java.sql.Timestamp           created;
	private final java.sql.Timestamp           removed;
	private final java.sql.Timestamp           removeTime;
	private final java.util.Map<String,Object> data;
	private final java.lang.Long               zoneId;

	public Instance(
		java.lang.Long               id,
		java.lang.String             name,
		java.lang.String             kind,
		java.lang.Long               accountId,
		java.lang.String             uuid,
		java.lang.String             description,
		java.lang.String             requestedState,
		java.lang.String             state,
		java.lang.String             allocationState,
		java.lang.String             postComputeState,
		java.lang.Long               imageId,
		java.lang.Long               offeringId,
		java.lang.Long               requestedOfferingId,
		java.lang.String             onCrash,
		java.lang.String             hostname,
		java.sql.Timestamp           created,
		java.sql.Timestamp           removed,
		java.sql.Timestamp           removeTime,
		java.util.Map<String,Object> data,
		java.lang.Long               zoneId
	) {
		this.id = id;
		this.name = name;
		this.kind = kind;
		this.accountId = accountId;
		this.uuid = uuid;
		this.description = description;
		this.requestedState = requestedState;
		this.state = state;
		this.allocationState = allocationState;
		this.postComputeState = postComputeState;
		this.imageId = imageId;
		this.offeringId = offeringId;
		this.requestedOfferingId = requestedOfferingId;
		this.onCrash = onCrash;
		this.hostname = hostname;
		this.created = created;
		this.removed = removed;
		this.removeTime = removeTime;
		this.data = data;
		this.zoneId = zoneId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return this.id;
	}

	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return this.kind;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return this.uuid;
	}

	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return this.description;
	}

	@javax.persistence.Column(name = "requested_state", length = 255)
	@Override
	public java.lang.String getRequestedState() {
		return this.requestedState;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return this.state;
	}

	@javax.persistence.Column(name = "allocation_state", nullable = false, length = 255)
	@Override
	public java.lang.String getAllocationState() {
		return this.allocationState;
	}

	@javax.persistence.Column(name = "post_compute_state", length = 255)
	@Override
	public java.lang.String getPostComputeState() {
		return this.postComputeState;
	}

	@javax.persistence.Column(name = "image_id", precision = 19)
	@Override
	public java.lang.Long getImageId() {
		return this.imageId;
	}

	@javax.persistence.Column(name = "offering_id", precision = 19)
	@Override
	public java.lang.Long getOfferingId() {
		return this.offeringId;
	}

	@javax.persistence.Column(name = "requested_offering_id", precision = 19)
	@Override
	public java.lang.Long getRequestedOfferingId() {
		return this.requestedOfferingId;
	}

	@javax.persistence.Column(name = "on_crash", nullable = false, length = 255)
	@Override
	public java.lang.String getOnCrash() {
		return this.onCrash;
	}

	@javax.persistence.Column(name = "hostname", length = 255)
	@Override
	public java.lang.String getHostname() {
		return this.hostname;
	}

	@javax.persistence.Column(name = "created")
	@Override
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}

	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.sql.Timestamp getRemoveTime() {
		return this.removeTime;
	}

	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return this.data;
	}

	@javax.persistence.Column(name = "zone_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getZoneId() {
		return this.zoneId;
	}
}
