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
@javax.persistence.Table(name = "network", schema = "dstack")
public class NetworkRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.NetworkRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record15<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.util.Map<String,Object>>, io.github.ibuildthecloud.dstack.db.jooq.generated.model.Network {

	private static final long serialVersionUID = -2095620196;

	/**
	 * Setter for <code>dstack.network.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.network.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.network.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.network.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.network.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.network.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", length = 255)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.network.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.network.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>dstack.network.is_public</code>. 
	 */
	public void setIsPublic(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.network.is_public</code>. 
	 */
	@javax.persistence.Column(name = "is_public", nullable = false, precision = 1)
	@Override
	public java.lang.Boolean getIsPublic() {
		return (java.lang.Boolean) getValue(4);
	}

	/**
	 * Setter for <code>dstack.network.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.network.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dstack.network.vnet_id</code>. 
	 */
	public void setVnetId(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.network.vnet_id</code>. 
	 */
	@javax.persistence.Column(name = "vnet_id", precision = 19)
	@Override
	public java.lang.Long getVnetId() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>dstack.network.offering_id</code>. 
	 */
	public void setOfferingId(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.network.offering_id</code>. 
	 */
	@javax.persistence.Column(name = "offering_id", precision = 19)
	@Override
	public java.lang.Long getOfferingId() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>dstack.network.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.network.state</code>. 
	 */
	@javax.persistence.Column(name = "state", length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>dstack.network.is_default</code>. 
	 */
	public void setIsDefault(java.lang.Boolean value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.network.is_default</code>. 
	 */
	@javax.persistence.Column(name = "is_default", nullable = false, precision = 1)
	@Override
	public java.lang.Boolean getIsDefault() {
		return (java.lang.Boolean) getValue(9);
	}

	/**
	 * Setter for <code>dstack.network.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.network.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>dstack.network.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dstack.network.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(11);
	}

	/**
	 * Setter for <code>dstack.network.remove_time</code>. 
	 */
	public void setRemoveTime(java.sql.Timestamp value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>dstack.network.remove_time</code>. 
	 */
	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.sql.Timestamp getRemoveTime() {
		return (java.sql.Timestamp) getValue(12);
	}

	/**
	 * Setter for <code>dstack.network.kind</code>. 
	 */
	public void setKind(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>dstack.network.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 128)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>dstack.network.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>dstack.network.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(14);
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
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.util.Map<String,Object>> fieldsRow() {
		return (org.jooq.Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.util.Map<String,Object>> valuesRow() {
		return (org.jooq.Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.IS_PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.VNET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.OFFERING_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field10() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.IS_DEFAULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field12() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field13() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.REMOVE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field15() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK.DATA;
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
	public java.lang.String value3() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getIsPublic();
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
	public java.lang.Long value7() {
		return getVnetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getOfferingId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value10() {
		return getIsDefault();
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value13() {
		return getRemoveTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value15() {
		return getData();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NetworkRecord
	 */
	public NetworkRecord() {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK);
	}

	/**
	 * Create a detached, initialised NetworkRecord
	 */
	public NetworkRecord(java.lang.Long id, java.lang.String name, java.lang.String uuid, java.lang.Long accountId, java.lang.Boolean isPublic, java.lang.String description, java.lang.Long vnetId, java.lang.Long offeringId, java.lang.String state, java.lang.Boolean isDefault, java.sql.Timestamp created, java.sql.Timestamp removed, java.sql.Timestamp removeTime, java.lang.String kind, java.util.Map<String,Object> data) {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK);

		setValue(0, id);
		setValue(1, name);
		setValue(2, uuid);
		setValue(3, accountId);
		setValue(4, isPublic);
		setValue(5, description);
		setValue(6, vnetId);
		setValue(7, offeringId);
		setValue(8, state);
		setValue(9, isDefault);
		setValue(10, created);
		setValue(11, removed);
		setValue(12, removeTime);
		setValue(13, kind);
		setValue(14, data);
	}
}
