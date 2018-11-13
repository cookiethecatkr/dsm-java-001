package com.dismentoring.mypackage;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class LDAPJndi {
	
	//서버와 연결
	public void connectLdap() throws NamingException {
		
		Hashtable<String, String> env = new Hashtable<String, String>(); 
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "192.168.0.60:389");
		env.put(Context.SECURITY_AUTHENTICATION, "SSL");
		env.put(Context.SECURITY_PRINCIPAL, "cn=govmanager");
		env.put(Context.SECURITY_CREDENTIALS, "GOVmoi!manager");
		DirContext ctx = new InitialDirContext(env); 
		
	}
}

