package com.innova.db.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class DatabaseManager {
	
	// In here, we got 2 error. About JSR-365, to solve this problem we have to
	// annotated our classes with @Alternative and we have to create our beans in
	// beans.xml
	@Inject
	private IDatabase iDatabase;
	
	public String getiDatabase() {
		return iDatabase.selectDatabase("Database : ");
	}
	
}
