package com.innova.db.enumqualifier;

@EQualifier(EDatabase.MARIADB)
public class Mariadb implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		// TODO Auto-generated method stub
		return "Optional Database : MariaDb";
	}
	
}
