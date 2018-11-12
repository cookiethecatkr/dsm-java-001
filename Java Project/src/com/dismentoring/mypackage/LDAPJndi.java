package com.dismentoring.mypackage;

import javax.naming.Context;

public class LDAPJndi {
	public void connectLDAP() {
		DataSource dataSource = null; 
		try
		{
			Context context = new InitialContext(); 
			dataSource = (DataSource) context.lookup("Database);
		}
		catch (NamingException e)
	}
}
