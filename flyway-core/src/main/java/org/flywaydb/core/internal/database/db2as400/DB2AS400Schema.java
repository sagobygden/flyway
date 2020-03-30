package org.flywaydb.core.internal.database.db2as400;

import org.flywaydb.core.api.logging.Log;
import org.flywaydb.core.api.logging.LogFactory;
import org.flywaydb.core.internal.database.base.Function;
import org.flywaydb.core.internal.database.base.Schema;
import org.flywaydb.core.internal.database.base.Table;
import org.flywaydb.core.internal.database.base.Type;
import org.flywaydb.core.internal.database.db2.DB2Function;
import org.flywaydb.core.internal.database.db2.DB2Table;
import org.flywaydb.core.internal.database.db2.DB2Type;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import java.sql.SQLException;

public class DB2AS400Schema extends Schema<DB2AS400Database, DB2AS400Table> {

    private static final Log LOG = LogFactory.getLog(DB2AS400Schema.class);

    /**
     * Creates a new DB2 schema.
     *
     * @param jdbcTemplate The Jdbc Template for communicating with the DB.
     * @param database     The database-specific support.
     * @param name         The name of the schema.
     */
    DB2AS400Schema(JdbcTemplate jdbcTemplate, DB2AS400Database database, String name) {
        super(jdbcTemplate, database, name);
    }

    @Override
    protected boolean doExists() throws SQLException {
        return jdbcTemplate.queryForInt("SELECT count(*) from ("
                + "SELECT 1 FROM sysibm.schemata WHERE schema_name=?"
                + ")", name) > 0;
    }

    @Override
    protected boolean doEmpty() throws SQLException {
        return false;
    }

    @Override
    protected void doCreate() throws SQLException {
        LOG.warn("doCreate method is not supported for DB2 for AS400");
    }

    @Override
    protected void doDrop() throws SQLException {
        LOG.warn("doDrop method is not supported for DB2 for AS400");
    }

    @Override
    protected void doClean() throws SQLException {
        LOG.warn("doClean method is not supported for DB2 for AS400");
    }

    @Override
    protected DB2AS400Table[] doAllTables() throws SQLException {
        return new DB2AS400Table[0];
    }

    @Override
    public Table getTable(String tableName) {
        return new DB2AS400Table(jdbcTemplate, database, this, tableName);
    }

    @Override
    protected Type getType(String typeName) {
        return new DB2AS400Type(jdbcTemplate, database, this, typeName);
    }

    @Override
    public Function getFunction(String functionName, String... args) {
        return new DB2AS400Function(jdbcTemplate, database, this, functionName, args);
    }
}
