package com.innova.db.qualifier;

@QualifierMultipleSelection
public class Mysql implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		return "Optional Database : MySql";
	}
	
}
