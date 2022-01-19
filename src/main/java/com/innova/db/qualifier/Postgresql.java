package com.innova.db.qualifier;

import javax.enterprise.inject.Default;

// for default use Postgresql
@Default
public class Postgresql implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		return "Default Database : PostgreSql";
	}
	
}
