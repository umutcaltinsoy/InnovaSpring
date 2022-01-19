package com.innova.db.enumqualifier;

import javax.enterprise.inject.Default;

// Default db Postgresql
@Default
public class DefaultDatabase implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		
		return "Default Database : PostgreSql";
	}
	
}
