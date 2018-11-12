package com.dismentoring.mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testCode {

	public static void main(String[] args) {
		
		DBJdbc db = new DBJdbc();
		
		db.update(2, "ÀÌÁøÇü");
		  
			
	}

}
