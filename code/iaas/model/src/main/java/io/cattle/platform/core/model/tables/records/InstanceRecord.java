/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "instance", schema = "cattle")
public class InstanceRecord extends org.jooq.impl.UpdatableRecordImpl<io.cattle.platform.core.model.tables.records.InstanceRecord> implements io.cattle.platform.db.jooq.utils.TableRecordJaxb, org.jooq.Record18<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long>, io.cattle.platform.core.model.Instance {

	private static final long serialVersionUID = -1354591030;

	/**
	 * Setter for <code>cattle.instance.id</code>.
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cattle.instance.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cattle.instance.name</code>.
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cattle.instance.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cattle.instance.account_id</code>.
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cattle.instance.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cattle.instance.kind</code>.
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cattle.instance.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cattle.instance.uuid</code>.
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cattle.instance.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cattle.instance.description</code>.
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cattle.instance.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cattle.instance.state</code>.
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cattle.instance.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cattle.instance.created</code>.
	 */
	@Override
	public void setCreated(java.util.Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cattle.instance.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.util.Date getCreated() {
		return (java.util.Date) getValue(7);
	}

	/**
	 * Setter for <code>cattle.instance.removed</code>.
	 */
	@Override
	public void setRemoved(java.util.Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cattle.instance.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.util.Date getRemoved() {
		return (java.util.Date) getValue(8);
	}

	/**
	 * Setter for <code>cattle.instance.remove_time</code>.
	 */
	@Override
	public void setRemoveTime(java.util.Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cattle.instance.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.util.Date getRemoveTime() {
		return (java.util.Date) getValue(9);
	}

	/**
	 * Setter for <code>cattle.instance.data</code>.
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cattle.instance.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(10);
	}

	/**
	 * Setter for <code>cattle.instance.allocation_state</code>.
	 */
	@Override
	public void setAllocationState(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cattle.instance.allocation_state</code>.
	 */
	@javax.persistence.Column(name = "allocation_state", length = 255)
	@Override
	public java.lang.String getAllocationState() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>cattle.instance.compute</code>.
	 */
	@Override
	public void setCompute(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cattle.instance.compute</code>.
	 */
	@javax.persistence.Column(name = "compute", precision = 19)
	@Override
	public java.lang.Long getCompute() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>cattle.instance.memory_mb</code>.
	 */
	@Override
	public void setMemoryMb(java.lang.Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cattle.instance.memory_mb</code>.
	 */
	@javax.persistence.Column(name = "memory_mb", precision = 19)
	@Override
	public java.lang.Long getMemoryMb() {
		return (java.lang.Long) getValue(13);
	}

	/**
	 * Setter for <code>cattle.instance.image_id</code>.
	 */
	@Override
	public void setImageId(java.lang.Long value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cattle.instance.image_id</code>.
	 */
	@javax.persistence.Column(name = "image_id", precision = 19)
	@Override
	public java.lang.Long getImageId() {
		return (java.lang.Long) getValue(14);
	}

	/**
	 * Setter for <code>cattle.instance.offering_id</code>.
	 */
	@Override
	public void setOfferingId(java.lang.Long value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cattle.instance.offering_id</code>.
	 */
	@javax.persistence.Column(name = "offering_id", precision = 19)
	@Override
	public java.lang.Long getOfferingId() {
		return (java.lang.Long) getValue(15);
	}

	/**
	 * Setter for <code>cattle.instance.hostname</code>.
	 */
	@Override
	public void setHostname(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>cattle.instance.hostname</code>.
	 */
	@javax.persistence.Column(name = "hostname", length = 255)
	@Override
	public java.lang.String getHostname() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>cattle.instance.zone_id</code>.
	 */
	@Override
	public void setZoneId(java.lang.Long value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>cattle.instance.zone_id</code>.
	 */
	@javax.persistence.Column(name = "zone_id", precision = 19)
	@Override
	public java.lang.Long getZoneId() {
		return (java.lang.Long) getValue(17);
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
	// Record18 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row18<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row18) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row18<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row18) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field8() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field9() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field10() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.REMOVE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field11() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.ALLOCATION_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field13() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.COMPUTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field14() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.MEMORY_MB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field15() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.IMAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field16() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.OFFERING_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.HOSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field18() {
		return io.cattle.platform.core.model.tables.InstanceTable.INSTANCE.ZONE_ID;
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
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getDescription();
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
	public java.util.Date value8() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Date value9() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Date value10() {
		return getRemoveTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value11() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getAllocationState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value13() {
		return getCompute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value14() {
		return getMemoryMb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value15() {
		return getImageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value16() {
		return getOfferingId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getHostname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value18() {
		return getZoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value3(java.lang.Long value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value4(java.lang.String value) {
		setKind(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value5(java.lang.String value) {
		setUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value6(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value7(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value8(java.util.Date value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value9(java.util.Date value) {
		setRemoved(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value10(java.util.Date value) {
		setRemoveTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value11(java.util.Map<String,Object> value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value12(java.lang.String value) {
		setAllocationState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value13(java.lang.Long value) {
		setCompute(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value14(java.lang.Long value) {
		setMemoryMb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value15(java.lang.Long value) {
		setImageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value16(java.lang.Long value) {
		setOfferingId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value17(java.lang.String value) {
		setHostname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value18(java.lang.Long value) {
		setZoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord values(java.lang.Long value1, java.lang.String value2, java.lang.Long value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.util.Date value8, java.util.Date value9, java.util.Date value10, java.util.Map<String,Object> value11, java.lang.String value12, java.lang.Long value13, java.lang.Long value14, java.lang.Long value15, java.lang.Long value16, java.lang.String value17, java.lang.Long value18) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.cattle.platform.core.model.Instance from) {
		setId(from.getId());
		setName(from.getName());
		setAccountId(from.getAccountId());
		setKind(from.getKind());
		setUuid(from.getUuid());
		setDescription(from.getDescription());
		setState(from.getState());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
		setRemoveTime(from.getRemoveTime());
		setData(from.getData());
		setAllocationState(from.getAllocationState());
		setCompute(from.getCompute());
		setMemoryMb(from.getMemoryMb());
		setImageId(from.getImageId());
		setOfferingId(from.getOfferingId());
		setHostname(from.getHostname());
		setZoneId(from.getZoneId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.cattle.platform.core.model.Instance> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InstanceRecord
	 */
	public InstanceRecord() {
		super(io.cattle.platform.core.model.tables.InstanceTable.INSTANCE);
	}

	/**
	 * Create a detached, initialised InstanceRecord
	 */
	public InstanceRecord(java.lang.Long id, java.lang.String name, java.lang.Long accountId, java.lang.String kind, java.lang.String uuid, java.lang.String description, java.lang.String state, java.util.Date created, java.util.Date removed, java.util.Date removeTime, java.util.Map<String,Object> data, java.lang.String allocationState, java.lang.Long compute, java.lang.Long memoryMb, java.lang.Long imageId, java.lang.Long offeringId, java.lang.String hostname, java.lang.Long zoneId) {
		super(io.cattle.platform.core.model.tables.InstanceTable.INSTANCE);

		setValue(0, id);
		setValue(1, name);
		setValue(2, accountId);
		setValue(3, kind);
		setValue(4, uuid);
		setValue(5, description);
		setValue(6, state);
		setValue(7, created);
		setValue(8, removed);
		setValue(9, removeTime);
		setValue(10, data);
		setValue(11, allocationState);
		setValue(12, compute);
		setValue(13, memoryMb);
		setValue(14, imageId);
		setValue(15, offeringId);
		setValue(16, hostname);
		setValue(17, zoneId);
	}
}
