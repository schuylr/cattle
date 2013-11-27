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
@javax.persistence.Table(name = "DATABASECHANGELOG", schema = "dstack")
public class DatabasechangelogRecord extends org.jooq.impl.TableRecordImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.DatabasechangelogRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, io.github.ibuildthecloud.dstack.db.jooq.generated.model.Databasechangelog {

	private static final long serialVersionUID = 784989107;

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.ID</code>. 
	 */
	public void setId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", nullable = false, length = 255)
	@Override
	public java.lang.String getId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.AUTHOR</code>. 
	 */
	public void setAuthor(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.AUTHOR</code>. 
	 */
	@javax.persistence.Column(name = "AUTHOR", nullable = false, length = 255)
	@Override
	public java.lang.String getAuthor() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.FILENAME</code>. 
	 */
	public void setFilename(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.FILENAME</code>. 
	 */
	@javax.persistence.Column(name = "FILENAME", nullable = false, length = 255)
	@Override
	public java.lang.String getFilename() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.DATEEXECUTED</code>. 
	 */
	public void setDateexecuted(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.DATEEXECUTED</code>. 
	 */
	@javax.persistence.Column(name = "DATEEXECUTED", nullable = false)
	@Override
	public java.sql.Timestamp getDateexecuted() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.ORDEREXECUTED</code>. 
	 */
	public void setOrderexecuted(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.ORDEREXECUTED</code>. 
	 */
	@javax.persistence.Column(name = "ORDEREXECUTED", nullable = false, precision = 10)
	@Override
	public java.lang.Integer getOrderexecuted() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.EXECTYPE</code>. 
	 */
	public void setExectype(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.EXECTYPE</code>. 
	 */
	@javax.persistence.Column(name = "EXECTYPE", nullable = false, length = 10)
	@Override
	public java.lang.String getExectype() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.MD5SUM</code>. 
	 */
	public void setMd5sum(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.MD5SUM</code>. 
	 */
	@javax.persistence.Column(name = "MD5SUM", length = 35)
	@Override
	public java.lang.String getMd5sum() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.DESCRIPTION</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.DESCRIPTION</code>. 
	 */
	@javax.persistence.Column(name = "DESCRIPTION", length = 255)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.COMMENTS</code>. 
	 */
	public void setComments(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.COMMENTS</code>. 
	 */
	@javax.persistence.Column(name = "COMMENTS", length = 255)
	@Override
	public java.lang.String getComments() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.TAG</code>. 
	 */
	public void setTag(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.TAG</code>. 
	 */
	@javax.persistence.Column(name = "TAG", length = 255)
	@Override
	public java.lang.String getTag() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>dstack.DATABASECHANGELOG.LIQUIBASE</code>. 
	 */
	public void setLiquibase(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.DATABASECHANGELOG.LIQUIBASE</code>. 
	 */
	@javax.persistence.Column(name = "LIQUIBASE", length = 20)
	@Override
	public java.lang.String getLiquibase() {
		return (java.lang.String) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.FILENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.DATEEXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.ORDEREXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.EXECTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.MD5SUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.COMMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG.LIQUIBASE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFilename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getDateexecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getOrderexecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getExectype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getMd5sum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getComments();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getLiquibase();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DatabasechangelogRecord
	 */
	public DatabasechangelogRecord() {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG);
	}

	/**
	 * Create a detached, initialised DatabasechangelogRecord
	 */
	public DatabasechangelogRecord(java.lang.String id, java.lang.String author, java.lang.String filename, java.sql.Timestamp dateexecuted, java.lang.Integer orderexecuted, java.lang.String exectype, java.lang.String md5sum, java.lang.String description, java.lang.String comments, java.lang.String tag, java.lang.String liquibase) {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG);

		setValue(0, id);
		setValue(1, author);
		setValue(2, filename);
		setValue(3, dateexecuted);
		setValue(4, orderexecuted);
		setValue(5, exectype);
		setValue(6, md5sum);
		setValue(7, description);
		setValue(8, comments);
		setValue(9, tag);
		setValue(10, liquibase);
	}
}
