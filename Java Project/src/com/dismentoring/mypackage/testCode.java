package com.dismentoring.mypackage;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.unboundid.ldap.sdk.LDAPException;

public class testCode {

	public static void main(String[] args) throws ClassNotFoundException, NamingException, LDAPException, IOException, SQLException{
		
		DBJdbc.select();         //JDBC API ����Ͽ� DB�� ����
		LDAPJndi.connectJndi();  //JNDI API ����Ͽ� DB�� ����
	    LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API����Ͽ� DB�� ����
	    DBMybatis.connectMybatis();  //myBatis �� �̿��Ͽ� DB�� ����
	    //DBJdbc.update1();        //DB update  (1�� �׸� usrnm�� jin���� Lee�� ���� ) 
		//DBJdbc.update2();        //DB  ������� update
		
		//DBJdbc.insert();       // ������ ���� 
		//DBJdbc.delete("6");        // ������ ���ϴ� �� ������ ��. 
		
	}	
		
		
		
		
		
		
		
		
		
	

}
