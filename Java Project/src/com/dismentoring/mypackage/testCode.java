package com.dismentoring.mypackage;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldif.LDIFException;




public class testCode {

	public static void main(String[] args) throws NamingException, ClassNotFoundException, IOException, SQLException, LDAPException, LDIFException   {
		
		//DBJdbc.select();         //JDBC API 사용하여 DB와 연결
		//LDAPJndi.connectJndi();  //JNDI API 사용하여 DB와 연결
	    //LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API사용하여 DB와 연결
	    //DBMybatis.connectMybatis();  //myBatis 를 이용하여 DB와 연결
	    //DBJdbc.update1();        //DB update  (1번 항목 usrnm을 jin에서 Lee로 변경 ) 
		//DBJdbc.update2();        //DB  원래대로 update
		
		//DBJdbc.insert();       // 데이터 삽입 
		//DBJdbc.delete("6");        // 삭제를 원하는 값 넣으면 됨. 
		
		//2차 추가 내용  
		
		//LDAPJndi.lookupJndi();      //JNDI를 이용해서 엔트리 조회
		//LDAPJndi.insertJndi();    //JNDI를 이용해서 엔트리 추가  (cn=007이진형002,ou=제1과,ou=IT감사단,ou=감사원,o=government of korea,c=kr)
		//LDAPJndi.deleteJndi();    //JNDI를 이용하여 엔트리 삭제  (위에 입력한 거 삭제) 
		//LDAPUnbound.searchSDK();    //UnboundID LDAP SDK를 사용하여 조회 
		//LDAPUnbound.addSDK();         //UnboundID LDAP SDK를 사용하여 추가
		//LDAPUnbound.modifySDK();       //UnboundID LDAP SDK를 사용하여 수정 
		//LDAPUnbound.deleteSDK();        //위에 추가한 내용을 지움. 007이진형005파일 삭제
	}	
		
	
		
		
		
		
		
		
		
	

}
