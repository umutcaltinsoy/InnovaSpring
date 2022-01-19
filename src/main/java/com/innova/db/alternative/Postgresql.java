package com.innova.db.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Postgresql implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		return "Chosen Database : PostgreSql";
	}
	
}
