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
@javax.persistence.Table(name = "volume", schema = "cattle")
public class VolumeRecord extends org.jooq.impl.UpdatableRecordImpl<io.cattle.platform.core.model.tables.records.VolumeRecord> implements io.cattle.platform.db.jooq.utils.TableRecordJaxb, org.jooq.Record21<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long>, io.cattle.platform.core.model.Volume {

	private static final long serialVersionUID = 1685625140;

	/**
	 * Setter for <code>cattle.volume.id</code>.
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cattle.volume.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cattle.volume.name</code>.
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cattle.volume.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cattle.volume.account_id</code>.
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cattle.volume.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cattle.volume.kind</code>.
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cattle.volume.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cattle.volume.uuid</code>.
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cattle.volume.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cattle.volume.description</code>.
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cattle.volume.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cattle.volume.state</code>.
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cattle.volume.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cattle.volume.created</code>.
	 */
	@Override
	public void setCreated(java.util.Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cattle.volume.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.util.Date getCreated() {
		return (java.util.Date) getValue(7);
	}

	/**
	 * Setter for <code>cattle.volume.removed</code>.
	 */
	@Override
	public void setRemoved(java.util.Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cattle.volume.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.util.Date getRemoved() {
		return (java.util.Date) getValue(8);
	}

	/**
	 * Setter for <code>cattle.volume.remove_time</code>.
	 */
	@Override
	public void setRemoveTime(java.util.Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cattle.volume.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.util.Date getRemoveTime() {
		return (java.util.Date) getValue(9);
	}

	/**
	 * Setter for <code>cattle.volume.data</code>.
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cattle.volume.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(10);
	}

	/**
	 * Setter for <code>cattle.volume.physical_size_mb</code>.
	 */
	@Override
	public void setPhysicalSizeMb(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cattle.volume.physical_size_mb</code>.
	 */
	@javax.persistence.Column(name = "physical_size_mb", precision = 19)
	@Override
	public java.lang.Long getPhysicalSizeMb() {
		return (java.lang.Long) getValue(11);
	}

	/**
	 * Setter for <code>cattle.volume.virtual_size_mb</code>.
	 */
	@Override
	public void setVirtualSizeMb(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cattle.volume.virtual_size_mb</code>.
	 */
	@javax.persistence.Column(name = "virtual_size_mb", precision = 19)
	@Override
	public java.lang.Long getVirtualSizeMb() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>cattle.volume.device_number</code>.
	 */
	@Override
	public void setDeviceNumber(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cattle.volume.device_number</code>.
	 */
	@javax.persistence.Column(name = "device_number", precision = 10)
	@Override
	public java.lang.Integer getDeviceNumber() {
		return (java.lang.Integer) getValue(13);
	}

	/**
	 * Setter for <code>cattle.volume.format</code>.
	 */
	@Override
	public void setFormat(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cattle.volume.format</code>.
	 */
	@javax.persistence.Column(name = "format", length = 255)
	@Override
	public java.lang.String getFormat() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>cattle.volume.allocation_state</code>.
	 */
	@Override
	public void setAllocationState(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cattle.volume.allocation_state</code>.
	 */
	@javax.persistence.Column(name = "allocation_state", length = 255)
	@Override
	public java.lang.String getAllocationState() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>cattle.volume.attached_state</code>.
	 */
	@Override
	public void setAttachedState(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>cattle.volume.attached_state</code>.
	 */
	@javax.persistence.Column(name = "attached_state", length = 255)
	@Override
	public java.lang.String getAttachedState() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>cattle.volume.instance_id</code>.
	 */
	@Override
	public void setInstanceId(java.lang.Long value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>cattle.volume.instance_id</code>.
	 */
	@javax.persistence.Column(name = "instance_id", precision = 19)
	@Override
	public java.lang.Long getInstanceId() {
		return (java.lang.Long) getValue(17);
	}

	/**
	 * Setter for <code>cattle.volume.image_id</code>.
	 */
	@Override
	public void setImageId(java.lang.Long value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>cattle.volume.image_id</code>.
	 */
	@javax.persistence.Column(name = "image_id", precision = 19)
	@Override
	public java.lang.Long getImageId() {
		return (java.lang.Long) getValue(18);
	}

	/**
	 * Setter for <code>cattle.volume.offering_id</code>.
	 */
	@Override
	public void setOfferingId(java.lang.Long value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>cattle.volume.offering_id</code>.
	 */
	@javax.persistence.Column(name = "offering_id", precision = 19)
	@Override
	public java.lang.Long getOfferingId() {
		return (java.lang.Long) getValue(19);
	}

	/**
	 * Setter for <code>cattle.volume.zone_id</code>.
	 */
	@Override
	public void setZoneId(java.lang.Long value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>cattle.volume.zone_id</code>.
	 */
	@javax.persistence.Column(name = "zone_id", precision = 19)
	@Override
	public java.lang.Long getZoneId() {
		return (java.lang.Long) getValue(20);
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
	// Record21 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row21<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row21) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row21<java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row21) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field8() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field9() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field10() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.REMOVE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field11() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field12() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.PHYSICAL_SIZE_MB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field13() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.VIRTUAL_SIZE_MB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.DEVICE_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.ALLOCATION_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.ATTACHED_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field18() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.INSTANCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field19() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.IMAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field20() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.OFFERING_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field21() {
		return io.cattle.platform.core.model.tables.VolumeTable.VOLUME.ZONE_ID;
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
	public java.lang.Long value12() {
		return getPhysicalSizeMb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value13() {
		return getVirtualSizeMb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value14() {
		return getDeviceNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getAllocationState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getAttachedState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value18() {
		return getInstanceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value19() {
		return getImageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value20() {
		return getOfferingId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value21() {
		return getZoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value3(java.lang.Long value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value4(java.lang.String value) {
		setKind(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value5(java.lang.String value) {
		setUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value6(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value7(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value8(java.util.Date value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value9(java.util.Date value) {
		setRemoved(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value10(java.util.Date value) {
		setRemoveTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value11(java.util.Map<String,Object> value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value12(java.lang.Long value) {
		setPhysicalSizeMb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value13(java.lang.Long value) {
		setVirtualSizeMb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value14(java.lang.Integer value) {
		setDeviceNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value15(java.lang.String value) {
		setFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value16(java.lang.String value) {
		setAllocationState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value17(java.lang.String value) {
		setAttachedState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value18(java.lang.Long value) {
		setInstanceId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value19(java.lang.Long value) {
		setImageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value20(java.lang.Long value) {
		setOfferingId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord value21(java.lang.Long value) {
		setZoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VolumeRecord values(java.lang.Long value1, java.lang.String value2, java.lang.Long value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.util.Date value8, java.util.Date value9, java.util.Date value10, java.util.Map<String,Object> value11, java.lang.Long value12, java.lang.Long value13, java.lang.Integer value14, java.lang.String value15, java.lang.String value16, java.lang.String value17, java.lang.Long value18, java.lang.Long value19, java.lang.Long value20, java.lang.Long value21) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.cattle.platform.core.model.Volume from) {
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
		setPhysicalSizeMb(from.getPhysicalSizeMb());
		setVirtualSizeMb(from.getVirtualSizeMb());
		setDeviceNumber(from.getDeviceNumber());
		setFormat(from.getFormat());
		setAllocationState(from.getAllocationState());
		setAttachedState(from.getAttachedState());
		setInstanceId(from.getInstanceId());
		setImageId(from.getImageId());
		setOfferingId(from.getOfferingId());
		setZoneId(from.getZoneId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.cattle.platform.core.model.Volume> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VolumeRecord
	 */
	public VolumeRecord() {
		super(io.cattle.platform.core.model.tables.VolumeTable.VOLUME);
	}

	/**
	 * Create a detached, initialised VolumeRecord
	 */
	public VolumeRecord(java.lang.Long id, java.lang.String name, java.lang.Long accountId, java.lang.String kind, java.lang.String uuid, java.lang.String description, java.lang.String state, java.util.Date created, java.util.Date removed, java.util.Date removeTime, java.util.Map<String,Object> data, java.lang.Long physicalSizeMb, java.lang.Long virtualSizeMb, java.lang.Integer deviceNumber, java.lang.String format, java.lang.String allocationState, java.lang.String attachedState, java.lang.Long instanceId, java.lang.Long imageId, java.lang.Long offeringId, java.lang.Long zoneId) {
		super(io.cattle.platform.core.model.tables.VolumeTable.VOLUME);

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
		setValue(11, physicalSizeMb);
		setValue(12, virtualSizeMb);
		setValue(13, deviceNumber);
		setValue(14, format);
		setValue(15, allocationState);
		setValue(16, attachedState);
		setValue(17, instanceId);
		setValue(18, imageId);
		setValue(19, offeringId);
		setValue(20, zoneId);
	}
}
