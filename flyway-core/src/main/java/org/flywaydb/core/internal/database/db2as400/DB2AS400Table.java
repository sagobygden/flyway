package org.flywaydb.core.internal.database.db2as400;

import org.flywaydb.core.internal.database.base.Table;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import java.sql.SQLException;

public class DB2AS400Table extends Table<DB2AS400Database, DB2AS400Schema> {

    /**
     * Creates a new Db2 table.
     *
     * @param jdbcTemplate The Jdbc Template for communicating with the DB.
     * @param database     The database-specific support.
     * @param schema       The schema this table lives in.
     * @param name         The name of the table.
     */
    DB2AS400Table(JdbcTemplate jdbcTemplate, DB2AS400Database database, DB2AS400Schema schema, String name) {
        super(jdbcTemplate, database, schema, name);
    }

    @Override
    protected boolean doExists() throws SQLException {
        return exists(null, schema, name);
    }

    @Override
    protected void doLock() throws SQLException {
        // do nothing
    }

    @Override
    protected void doDrop() throws SQLException {
        // do nothing
    }
}
