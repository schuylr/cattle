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
@javax.persistence.Table(name = "host_group", schema = "dstack")
public class HostGroup implements io.github.ibuildthecloud.dstack.db.jooq.generated.model.HostGroup {

	private static final long serialVersionUID = 1562065467;

	private final java.lang.Long     id;
	private final java.lang.String   name;
	private final java.lang.String   description;
	private final java.sql.Timestamp created;
	private final java.sql.Timestamp removed;

	public HostGroup(
		java.lang.Long     id,
		java.lang.String   name,
		java.lang.String   description,
		java.sql.Timestamp created,
		java.sql.Timestamp removed
	) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.created = created;
		this.removed = removed;
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

	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return this.description;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	@Override
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}
}
