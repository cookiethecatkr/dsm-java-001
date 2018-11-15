package com.dismentoring.mypackage;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.unboundid.ldap.sdk.LDAPException;

public class testCode {

	public static void main(String[] args) throws ClassNotFoundException, NamingException, LDAPException, IOException, SQLException{
		
		DBJdbc.select();         //JDBC API 사용하여 DB와 연결
		LDAPJndi.connectJndi();  //JNDI API 사용하여 DB와 연결
	    LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API사용하여 DB와 연결
	    DBMybatis.connectMybatis();  //myBatis 를 이용하여 DB와 연결
	    //DBJdbc.update1();        //DB update  (1번 항목 usrnm을 jin에서 Lee로 변경 ) 
		//DBJdbc.update2();        //DB  원래대로 update
		
		//DBJdbc.insert();       // 데이터 삽입 
		//DBJdbc.delete("6");        // 삭제를 원하는 값 넣으면 됨. 
		
	}	
		
		
		
		
		
		
		
		
		
	

}
