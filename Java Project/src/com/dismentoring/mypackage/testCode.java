package com.dismentoring.mypackage;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldif.LDIFException;




public class testCode {

	public static void main(String[] args) throws NamingException, ClassNotFoundException, IOException, SQLException, LDAPException, LDIFException   {
		
		//DBJdbc.select();         //JDBC API ����Ͽ� DB�� ����
		//LDAPJndi.connectJndi();  //JNDI API ����Ͽ� DB�� ����
	    //LDAPUnbound.connectSDK();  //UnboundID LDAP SDK API����Ͽ� DB�� ����
	    //DBMybatis.connectMybatis();  //myBatis �� �̿��Ͽ� DB�� ����
	    //DBJdbc.update1();        //DB update  (1�� �׸� usrnm�� jin���� Lee�� ���� ) 
		//DBJdbc.update2();        //DB  ������� update
		
		//DBJdbc.insert();       // ������ ���� 
		//DBJdbc.delete("6");        // ������ ���ϴ� �� ������ ��. 
		
		//2�� �߰� ����  
		
		//LDAPJndi.lookupJndi();      //JNDI�� �̿��ؼ� ��Ʈ�� ��ȸ
		//LDAPJndi.insertJndi();    //JNDI�� �̿��ؼ� ��Ʈ�� �߰�  (cn=007������002,ou=��1��,ou=IT�����,ou=�����,o=government of korea,c=kr)
		//LDAPJndi.deleteJndi();    //JNDI�� �̿��Ͽ� ��Ʈ�� ����  (���� �Է��� �� ����) 
		//LDAPUnbound.searchSDK();    //UnboundID LDAP SDK�� ����Ͽ� ��ȸ 
		//LDAPUnbound.addSDK();         //UnboundID LDAP SDK�� ����Ͽ� �߰�
		//LDAPUnbound.modifySDK();       //UnboundID LDAP SDK�� ����Ͽ� ���� 
		//LDAPUnbound.deleteSDK();        //���� �߰��� ������ ����. 007������005���� ����
	}	
		
	
		
		
		
		
		
		
		
	

}
