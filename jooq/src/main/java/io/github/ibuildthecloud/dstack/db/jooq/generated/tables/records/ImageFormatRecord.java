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
@javax.persistence.Table(name = "image_format", schema = "dstack")
public class ImageFormatRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.ImageFormatRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record4<java.lang.Long, java.lang.Long, java.lang.String, java.util.Map<String,Object>>, io.github.ibuildthecloud.dstack.db.jooq.generated.model.ImageFormat {

	private static final long serialVersionUID = 773862423;

	/**
	 * Setter for <code>dstack.image_format.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.image_format.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.image_format.template_id</code>. 
	 */
	public void setTemplateId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.image_format.template_id</code>. 
	 */
	@javax.persistence.Column(name = "template_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getTemplateId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>dstack.image_format.format</code>. 
	 */
	public void setFormat(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.image_format.format</code>. 
	 */
	@javax.persistence.Column(name = "format", nullable = false, length = 128)
	@Override
	public java.lang.String getFormat() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.image_format.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.image_format.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.Long, java.lang.String, java.util.Map<String,Object>> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.Long, java.lang.String, java.util.Map<String,Object>> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageFormatTable.IMAGE_FORMAT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageFormatTable.IMAGE_FORMAT.TEMPLATE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageFormatTable.IMAGE_FORMAT.FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field4() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageFormatTable.IMAGE_FORMAT.DATA;
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
	public java.lang.Long value2() {
		return getTemplateId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value4() {
		return getData();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ImageFormatRecord
	 */
	public ImageFormatRecord() {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageFormatTable.IMAGE_FORMAT);
	}

	/**
	 * Create a detached, initialised ImageFormatRecord
	 */
	public ImageFormatRecord(java.lang.Long id, java.lang.Long templateId, java.lang.String format, java.util.Map<String,Object> data) {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageFormatTable.IMAGE_FORMAT);

		setValue(0, id);
		setValue(1, templateId);
		setValue(2, format);
		setValue(3, data);
	}
}
