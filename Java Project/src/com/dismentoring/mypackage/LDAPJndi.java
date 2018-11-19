package com.dismentoring.mypackage;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;

public class  LDAPJndi {
	
	//JNDI API�� ����Ͽ� ������ ���� (Connecting to LDAP server using JNDI)
	public static  DirContext connectJndi() throws NamingException {
		
		Hashtable<String, String> env = new Hashtable<String, String>(); 
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://192.168.0.60:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, "cn=govmanager");
		env.put(Context.SECURITY_CREDENTIALS, "GOVmoi!manager");
		DirContext ctx = new InitialDirContext(env); 
		//LdapContext ctx = new InitialLdapContext(env,null);
		return ctx;
	} 
	
	//��Ʈ�� ��ȸ �޼���
	public static void lookupJndi() throws NamingException {
		DirContext ctx = connectJndi();
		//LdapContext ctx = (LdapContext) connectJndi();
		SearchControls ctls = new SearchControls();
		ctls.setSearchScope(SearchControls.ONELEVEL_SCOPE);
		//ctls.setReturningAttributes(new String[] {"cn"});
		//String searchFilter=String.format("(cn=%s)", "cn" );
		String searchFilter="(objectClass=*)";
		//String searchFilter="(o=*)";
		
		NamingEnumeration<javax.naming.directory.SearchResult> results = ctx.search("c=kr", searchFilter,ctls);
		while(results.hasMoreElements()){
			javax.naming.directory.SearchResult sr = results.next();
			Attributes attrs = sr.getAttributes();
			//System.out.println(sr);
			System.out.println(attrs);
		}	
		ctx.close();
	} // method
	
	//��Ʈ�� �߰� �޼���
	public static void insertJndi( ) throws NamingException  {
		DirContext ctx = connectJndi();
		
		Attributes attributes = new BasicAttributes(); 
		Attribute objectClass = new BasicAttribute("objectClass");
		objectClass.add("inetOrgPerson");
		attributes.put(objectClass);
		
		Attribute sn = new BasicAttribute("sn");
		Attribute cn = new BasicAttribute("cn");
		
		sn.add("jin");
		cn.add("lee");
		
		attributes.put(sn);
		attributes.put(cn);
		
		//ctx.createSubcontext("cn=009������001,ou=people,ou=�����,o=government of korea,c=kr", attributes);
		ctx.createSubcontext("cn=007������002,ou=��1��,ou=IT�����,ou=�����,o=government of korea,c=kr", attributes);
		//ctx.createSubcontext("ou=�����1,o=government of korea,c=kr", attributes);
		System.out.println("�Էµ����ſ���. �Էµƴµ� �� ������ ������");
		ctx.close();
		
		/* LDAPAttributeSet attrs = new LDAPAttributeSet();
		String objectclass_values[] = { "top", "person", "op","11" };
		LDAPAttribute attr = new LDAPAttribute("objectclass",objectclass_values);
		//Attribute objectClass = new BasicAttribute("objectClass");
		attrs.add(attr);
		LDAPEntry myEntry = new LDAPEntry("cn=jin,c=kr", attrs);
		 ctx.add(myEntry);
		 */
	} //method
	
	//�����ͻ��� �޼��� 
	public static void deleteJndi() throws NamingException {
		DirContext ctx = connectJndi();
		ctx.destroySubcontext("cn=007������002,ou=��1��,ou=IT�����,ou=�����,o=government of korea,c=kr");
		System.out.println("��������������. �����ƴµ� �� ������ ������.");
		ctx.close();
	}
	
	
	
	
} //LDAPJndi

