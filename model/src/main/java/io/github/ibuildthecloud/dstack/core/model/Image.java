/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "image", schema = "dstack")
public interface Image extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.image.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.image.name</code>. 
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>dstack.image.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>dstack.image.uuid</code>. 
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>dstack.image.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 255)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>dstack.image.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>dstack.image.url</code>. 
	 */
	public void setUrl(java.lang.String value);

	/**
	 * Getter for <code>dstack.image.url</code>. 
	 */
	@javax.persistence.Column(name = "url", length = 255)
	public java.lang.String getUrl();

	/**
	 * Setter for <code>dstack.image.description</code>. 
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>dstack.image.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>dstack.image.is_public</code>. 
	 */
	public void setIsPublic(java.lang.Boolean value);

	/**
	 * Getter for <code>dstack.image.is_public</code>. 
	 */
	@javax.persistence.Column(name = "is_public", nullable = false, precision = 1)
	public java.lang.Boolean getIsPublic();

	/**
	 * Setter for <code>dstack.image.state</code>. 
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>dstack.image.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	public java.lang.String getState();

	/**
	 * Setter for <code>dstack.image.prepopulate</code>. 
	 */
	public void setPrepopulate(java.lang.Boolean value);

	/**
	 * Getter for <code>dstack.image.prepopulate</code>. 
	 */
	@javax.persistence.Column(name = "prepopulate", nullable = false, precision = 1)
	public java.lang.Boolean getPrepopulate();

	/**
	 * Setter for <code>dstack.image.prepopulate_stamp</code>. 
	 */
	public void setPrepopulateStamp(java.lang.String value);

	/**
	 * Getter for <code>dstack.image.prepopulate_stamp</code>. 
	 */
	@javax.persistence.Column(name = "prepopulate_stamp", nullable = false, length = 255)
	public java.lang.String getPrepopulateStamp();

	/**
	 * Setter for <code>dstack.image.physical_size_bytes</code>. 
	 */
	public void setPhysicalSizeBytes(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image.physical_size_bytes</code>. 
	 */
	@javax.persistence.Column(name = "physical_size_bytes", precision = 19)
	public java.lang.Long getPhysicalSizeBytes();

	/**
	 * Setter for <code>dstack.image.virtual_size_bytes</code>. 
	 */
	public void setVirtualSizeBytes(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image.virtual_size_bytes</code>. 
	 */
	@javax.persistence.Column(name = "virtual_size_bytes", precision = 19)
	public java.lang.Long getVirtualSizeBytes();

	/**
	 * Setter for <code>dstack.image.checksum</code>. 
	 */
	public void setChecksum(java.lang.String value);

	/**
	 * Getter for <code>dstack.image.checksum</code>. 
	 */
	@javax.persistence.Column(name = "checksum", length = 255)
	public java.lang.String getChecksum();

	/**
	 * Setter for <code>dstack.image.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated();

	/**
	 * Setter for <code>dstack.image.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved();

	/**
	 * Setter for <code>dstack.image.remove_time</code>. 
	 */
	public void setRemoveTime(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image.remove_time</code>. 
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.sql.Timestamp getRemoveTime();

	/**
	 * Setter for <code>dstack.image.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>dstack.image.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Image
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.Image from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Image
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.Image> E into(E into);
}