package com.dismentoring.mypackage;

import javax.naming.NamingException;

import com.unboundid.ldap.sdk.LDAPException;

public class testCode {

	public static void main(String[] args) throws ClassNotFoundException, NamingException, LDAPException {
		
		DBJdbc.select();         //JDBC API 사용하여 DB와 연결
		LDAPJndi.connectJndi();  //JNDI API 사용하여 DB와 연결
	    LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API사용하여 DB와 연결
		
		
	}	
		
		
		
		
		
		
		
		
		
	

}
