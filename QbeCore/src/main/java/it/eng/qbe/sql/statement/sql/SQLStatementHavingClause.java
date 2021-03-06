/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice.
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package it.eng.qbe.sql.statement.sql;

import it.eng.qbe.jpa.statement.jpa.JPQLStatementHavingClause;
import it.eng.qbe.runtime.query.Query;
import it.eng.qbe.runtime.statement.IConditionalOperator;
import it.eng.qbe.runtime.statement.runtime.AbstractStatementHavingClause;

import java.util.Map;

import org.apache.log4j.Logger;

/**
 * @author Alberto Ghedin (alberto.ghedin@eng.it)
 */

public class SQLStatementHavingClause extends AbstractStatementHavingClause {

	public static transient Logger logger = Logger.getLogger(JPQLStatementHavingClause.class);

	public static String build(SQLStatement parentStatement, Query query, Map<String, Map<String, String>> entityAliasesMaps) {
		SQLStatementHavingClause clause = new SQLStatementHavingClause(parentStatement);
		return clause.buildClause(query, entityAliasesMaps);
	}

	protected SQLStatementHavingClause(SQLStatement statement) {
		parentStatement = statement;
	}

	@Override
	public IConditionalOperator getOperator(String operator) {
		return SQLStatementConditionalOperators.getOperator(operator);
	}

}
