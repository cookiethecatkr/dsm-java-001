package com.dismentoring.mypackage;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;




public class testCode {

	public static void main(String[] args) throws NamingException, ClassNotFoundException, IOException, SQLException   {
		
		//DBJdbc.select();         //JDBC API ����Ͽ� DB�� ����
		//LDAPJndi.connectJndi();  //JNDI API ����Ͽ� DB�� ����
	    //LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API����Ͽ� DB�� ����
	    //DBMybatis.connectMybatis();  //myBatis �� �̿��Ͽ� DB�� ����
	    //DBJdbc.update1();        //DB update  (1�� �׸� usrnm�� jin���� Lee�� ���� ) 
		//DBJdbc.update2();        //DB  ������� update
		
		//DBJdbc.insert();       // ������ ���� 
		//DBJdbc.delete("6");        // ������ ���ϴ� �� ������ ��. 
		//LDAPJndi.lookupJndi();      //JNDI�� �̿��ؼ� ��Ʈ�� ��ȸ
		
		//LDAPJndi.insertJndi();    //JNDI�� �̿��ؼ� ��Ʈ�� �߰�  (cn=007������002,ou=��1��,ou=IT�����,ou=�����,o=government of korea,c=kr)
		LDAPJndi.deleteJndi();    //JNDI�� �̿��Ͽ� ��Ʈ�� ����  (���� �Է��� �� ����) 
		
	}	
		
	
		
		
		
		
		
		
		
	

}
