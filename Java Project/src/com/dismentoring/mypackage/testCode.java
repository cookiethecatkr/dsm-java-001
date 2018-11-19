package com.dismentoring.mypackage;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;




public class testCode {

	public static void main(String[] args) throws NamingException, ClassNotFoundException, IOException, SQLException   {
		
		//DBJdbc.select();         //JDBC API 사용하여 DB와 연결
		//LDAPJndi.connectJndi();  //JNDI API 사용하여 DB와 연결
	    //LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API사용하여 DB와 연결
	    //DBMybatis.connectMybatis();  //myBatis 를 이용하여 DB와 연결
	    //DBJdbc.update1();        //DB update  (1번 항목 usrnm을 jin에서 Lee로 변경 ) 
		//DBJdbc.update2();        //DB  원래대로 update
		
		//DBJdbc.insert();       // 데이터 삽입 
		//DBJdbc.delete("6");        // 삭제를 원하는 값 넣으면 됨. 
		//LDAPJndi.lookupJndi();      //JNDI를 이용해서 엔트리 조회
		
		//LDAPJndi.insertJndi();    //JNDI를 이용해서 엔트리 추가  (cn=007이진형002,ou=제1과,ou=IT감사단,ou=감사원,o=government of korea,c=kr)
		LDAPJndi.deleteJndi();    //JNDI를 이용하여 엔트리 삭제  (위에 입력한 거 삭제) 
		
	}	
		
	
		
		
		
		
		
		
		
	

}
