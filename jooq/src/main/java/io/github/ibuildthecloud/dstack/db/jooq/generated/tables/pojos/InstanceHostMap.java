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
@javax.persistence.Table(name = "instance_host_map", schema = "dstack")
public class InstanceHostMap implements io.github.ibuildthecloud.dstack.db.jooq.generated.model.InstanceHostMap {

	private static final long serialVersionUID = 666162489;

	private final java.lang.Long     id;
	private final java.lang.String   state;
	private final java.lang.Long     instanceId;
	private final java.lang.Long     hostId;
	private final java.sql.Timestamp removed;

	public InstanceHostMap(
		java.lang.Long     id,
		java.lang.String   state,
		java.lang.Long     instanceId,
		java.lang.Long     hostId,
		java.sql.Timestamp removed
	) {
		this.id = id;
		this.state = state;
		this.instanceId = instanceId;
		this.hostId = hostId;
		this.removed = removed;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return this.id;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	@Override
	public java.lang.String getState() {
		return this.state;
	}

	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getInstanceId() {
		return this.instanceId;
	}

	@javax.persistence.Column(name = "host_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getHostId() {
		return this.hostId;
	}

	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}
}
