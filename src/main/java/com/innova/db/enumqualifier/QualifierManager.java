package com.innova.db.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class QualifierManager {
	
	// // default
	// @Inject
	// IDatabase iDatabase;
	
	// optional
	@Inject
	@EQualifier(EDatabase.MYSQL)
	IDatabase iDatabase;
	
	public String getiDatabase() {
		return iDatabase.selectDatabase("Select :");
	}
	
}
