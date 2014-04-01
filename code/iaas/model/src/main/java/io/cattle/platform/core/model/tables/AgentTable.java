/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AgentTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.AgentRecord> {

	private static final long serialVersionUID = -1513520703;

	/**
	 * The singleton instance of <code>cattle.agent</code>
	 */
	public static final io.cattle.platform.core.model.tables.AgentTable AGENT = new io.cattle.platform.core.model.tables.AgentTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.AgentRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.AgentRecord.class;
	}

	/**
	 * The column <code>cattle.agent.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.agent.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.agent.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.agent.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.agent.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.agent.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.agent.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.agent.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.agent.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.agent.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.agent.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.agent.uri</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.String> URI = createField("uri", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.agent.managed_config</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.Boolean> MANAGED_CONFIG = createField("managed_config", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>cattle.agent.agent_group_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.Long> AGENT_GROUP_ID = createField("agent_group_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.agent.zone_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.Long> ZONE_ID = createField("zone_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>cattle.agent</code> table reference
	 */
	public AgentTable() {
		this("agent", null);
	}

	/**
	 * Create an aliased <code>cattle.agent</code> table reference
	 */
	public AgentTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.AgentTable.AGENT);
	}

	private AgentTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.AgentRecord> aliased) {
		this(alias, aliased, null);
	}

	private AgentTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.AgentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.AgentRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_AGENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AgentRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_AGENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AgentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AgentRecord>>asList(io.cattle.platform.core.model.Keys.KEY_AGENT_PRIMARY, io.cattle.platform.core.model.Keys.KEY_AGENT_IDX_AGENT_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.AgentRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.AgentRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_AGENT__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_AGENT__AGENT_GROUP_ID, io.cattle.platform.core.model.Keys.FK_AGENT__ZONE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.AgentTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.AgentTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.AgentTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.AgentTable(name, null);
	}
}
