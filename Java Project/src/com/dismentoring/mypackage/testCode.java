package com.dismentoring.mypackage;

import java.io.IOException;

import javax.naming.NamingException;

import com.unboundid.ldap.sdk.LDAPException;

public class testCode {

	public static void main(String[] args) throws ClassNotFoundException, NamingException, LDAPException, IOException{
		
		DBJdbc.select();         //JDBC API ����Ͽ� DB�� ����
		LDAPJndi.connectJndi();  //JNDI API ����Ͽ� DB�� ����
	    LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API����Ͽ� DB�� ����
		DBJdbc.update1();        //DB update  (�����̸��� test���� jin���� ����) 
		//DBJdbc.update2();        //DB  ������� update
		DBMybatis.connectMybatis();
	}	
		
		
		
		
		
		
		
		
		
	

}
