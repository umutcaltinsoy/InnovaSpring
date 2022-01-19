package com.innova.db.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements IDatabase {
	
	@Override
	public String selectDatabase(String version) {
		return "Chosen Database : MySql";
	}
	
}
