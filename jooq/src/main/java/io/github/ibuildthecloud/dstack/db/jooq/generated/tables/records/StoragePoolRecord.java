/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "storage_pool", schema = "dstack")
public class StoragePoolRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record12<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp>, io.github.ibuildthecloud.dstack.db.jooq.generated.model.StoragePool {

	private static final long serialVersionUID = -1314279794;

	/**
	 * Setter for <code>dstack.storage_pool.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.storage_pool.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 255)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.storage_pool.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.storage_pool.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dstack.storage_pool.kind</code>. 
	 */
	public void setKind(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>dstack.storage_pool.content_type</code>. 
	 */
	public void setContentType(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.content_type</code>. 
	 */
	@javax.persistence.Column(name = "content_type", nullable = false, length = 255)
	@Override
	public java.lang.String getContentType() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dstack.storage_pool.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dstack.storage_pool.physical_total_bytes</code>. 
	 */
	public void setPhysicalTotalBytes(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.physical_total_bytes</code>. 
	 */
	@javax.persistence.Column(name = "physical_total_bytes", precision = 19)
	@Override
	public java.lang.Long getPhysicalTotalBytes() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>dstack.storage_pool.physical_used_bytes</code>. 
	 */
	public void setPhysicalUsedBytes(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.physical_used_bytes</code>. 
	 */
	@javax.persistence.Column(name = "physical_used_bytes", precision = 19)
	@Override
	public java.lang.Long getPhysicalUsedBytes() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>dstack.storage_pool.virtual_total_bytes</code>. 
	 */
	public void setVirtualTotalBytes(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.virtual_total_bytes</code>. 
	 */
	@javax.persistence.Column(name = "virtual_total_bytes", precision = 19)
	@Override
	public java.lang.Long getVirtualTotalBytes() {
		return (java.lang.Long) getValue(9);
	}

	/**
	 * Setter for <code>dstack.storage_pool.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>dstack.storage_pool.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.CONTENT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.PHYSICAL_TOTAL_BYTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.PHYSICAL_USED_BYTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.VIRTUAL_TOTAL_BYTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field12() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getContentType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getPhysicalTotalBytes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getPhysicalUsedBytes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getVirtualTotalBytes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value12() {
		return getRemoved();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StoragePoolRecord
	 */
	public StoragePoolRecord() {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL);
	}

	/**
	 * Create a detached, initialised StoragePoolRecord
	 */
	public StoragePoolRecord(java.lang.Long id, java.lang.String uuid, java.lang.String name, java.lang.String description, java.lang.String kind, java.lang.String contentType, java.lang.String state, java.lang.Long physicalTotalBytes, java.lang.Long physicalUsedBytes, java.lang.Long virtualTotalBytes, java.sql.Timestamp created, java.sql.Timestamp removed) {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, name);
		setValue(3, description);
		setValue(4, kind);
		setValue(5, contentType);
		setValue(6, state);
		setValue(7, physicalTotalBytes);
		setValue(8, physicalUsedBytes);
		setValue(9, virtualTotalBytes);
		setValue(10, created);
		setValue(11, removed);
	}
}
