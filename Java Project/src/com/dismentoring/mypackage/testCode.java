package com.dismentoring.mypackage;

import javax.naming.NamingException;

import com.unboundid.ldap.sdk.LDAPException;

public class testCode {

	public static void main(String[] args) throws ClassNotFoundException, NamingException, LDAPException {
		
		DBJdbc.select();         //JDBC API ����Ͽ� DB�� ����
		LDAPJndi.connectJndi();  //JNDI API ����Ͽ� DB�� ����
	    LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API����Ͽ� DB�� ����
		
		
	}	
		
		
		
		
		
		
		
		
		
	

}
