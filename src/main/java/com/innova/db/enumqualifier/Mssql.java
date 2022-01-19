package com.innova.db.enumqualifier;

@EQualifier(EDatabase.MSSQL)
public class Mssql implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		// TODO Auto-generated method stub
		return "Optional Database : MsSql";
	}
	
}
