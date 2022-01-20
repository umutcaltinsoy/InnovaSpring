package com.innova.db.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCDI")
@ApplicationScoped
public class QualifierDatabaseManager implements Serializable {
	
	private static final long serialVersionUID = -5941947253904028432L;
	
	// for default db
	// @Inject
	// private IDatabase iDatabase;
	
	// for optional db
	@Inject
	@QualifierMultipleSelection
	private IDatabase iDatabase;
	
	public String getiDatabase() {
		return iDatabase.selectDatabase("Database : ");
	}
	
}
