package com.dismentoring.mypackage;

import java.io.IOException;

import javax.naming.NamingException;

import com.unboundid.ldap.sdk.LDAPException;

public class testCode {

	public static void main(String[] args) throws ClassNotFoundException, NamingException, LDAPException, IOException{
		
		DBJdbc.select();         //JDBC API 사용하여 DB와 연결
		LDAPJndi.connectJndi();  //JNDI API 사용하여 DB와 연결
	    LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API사용하여 DB와 연결
		DBJdbc.update1();        //DB update  (유저이름을 test에서 jin으로 변경) 
		//DBJdbc.update2();        //DB  원래대로 update
		DBMybatis.connectMybatis();
	}	
		
		
		
		
		
		
		
		
		
	

}
