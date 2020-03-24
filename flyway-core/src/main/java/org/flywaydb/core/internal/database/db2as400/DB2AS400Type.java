package org.flywaydb.core.internal.database.db2as400;

import org.flywaydb.core.internal.database.base.Type;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import java.sql.SQLException;

public class DB2AS400Type extends Type<DB2AS400Database, DB2AS400Schema> {

    /**
     * Creates a new Db2 type.
     *
     * @param jdbcTemplate The Jdbc Template for communicating with the DB.
     * @param database     The database-specific support.
     * @param schema       The schema this type lives in.
     * @param name         The name of the type.
     */
    DB2AS400Type(JdbcTemplate jdbcTemplate, DB2AS400Database database, DB2AS400Schema schema, String name) {
        super(jdbcTemplate, database, schema, name);
    }

    @Override
    protected void doDrop() throws SQLException {
        // do nothing
    }
}
