package com.innova.db.qualifier;

@QualifierMultipleSelection
public class Mssql implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		return "Optional Database : MsSql";
	}
	
}
