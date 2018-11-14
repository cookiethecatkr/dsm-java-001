package com.dismentoring.mypackage;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class  LDAPJndi {
	
	//JNDI API를 사용하여 서버와 연결
	public static void connectJndi() throws NamingException {
		
		
		Hashtable<String, String> env = new Hashtable<String, String>(); 
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://192.168.0.60:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, "cn=govmanager");
		env.put(Context.SECURITY_CREDENTIALS, "GOVmoi!manager");
		DirContext ctx = new InitialDirContext(env); 
		System.out.println(ctx.getEnvironment());
		System.out.println(ctx);
		
	}
}

