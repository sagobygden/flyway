package org.flywaydb.core.internal.database.db2as400;

import org.flywaydb.core.api.configuration.Configuration;
import org.flywaydb.core.internal.database.db2.DB2Parser;
import org.flywaydb.core.internal.parser.ParsingContext;

public class DB2AS400Parser extends DB2Parser {

    public DB2AS400Parser(Configuration configuration, ParsingContext parsingContext) {
        super(configuration, parsingContext);
    }
}
