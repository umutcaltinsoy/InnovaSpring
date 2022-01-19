package com.innova.db.enumqualifier;

@EQualifier(EDatabase.MYSQL)
public class Mysql implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		// TODO Auto-generated method stub
		return "Optional Database : MySql";
	}
	
}
