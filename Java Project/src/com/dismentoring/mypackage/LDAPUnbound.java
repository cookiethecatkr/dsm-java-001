package com.dismentoring.mypackage;

import com.mysql.cj.xdevapi.AddResult;
import com.unboundid.ldap.sdk.AddRequest;
import com.unboundid.ldap.sdk.DeleteRequest;
import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.LDAPResult;
import com.unboundid.ldap.sdk.Modification;
import com.unboundid.ldap.sdk.ModificationType;
import com.unboundid.ldap.sdk.SearchRequest;
import com.unboundid.ldap.sdk.SearchResult;
import com.unboundid.ldap.sdk.SearchScope;
import com.unboundid.ldif.LDIFException;

public class LDAPUnbound {
    
	// UnboundID SDK�� �̿��Ͽ� LDAP ������ ���� 
	public static LDAPConnection connectSDK() throws LDAPException    {
		
		LDAPConnection ldap = new LDAPConnection("192.168.0.60",389,"cn=govmanager","GOVmoi!manager");
		return ldap;
		
	}
    
	// ��ȸ�ϴ� �޼ҵ� 
	public static void searchSDK() throws LDAPException {
		LDAPConnection ldap = connectSDK();
		String filter = "cn=007������002";
		SearchRequest searchRequest = new SearchRequest("c=kr",SearchScope.SUB,filter);
		System.out.println(searchRequest);
		SearchResult searchResult = ldap.search(searchRequest);
		System.out.println(searchResult);
		ldap.close();
	}
	
	//�߰��ϴ� �޼ҵ� 
	public static void addSDK() throws LDAPException, LDIFException {
		LDAPConnection ldap = connectSDK();
		LDAPResult addResult =  ldap.add("dn:cn=007������005,ou=��1��,ou=IT�����,ou=�����, o=government of korea,c=kr", "objectClass: top", "objectClass: user", "cn:jin");
		System.out.println(addResult);
		ldap.close();
		
	}
	
	//�����ϴ� �޼ҵ�
	public static void modifySDK() throws LDAPException, LDIFException {
		LDAPConnection ldap = connectSDK();
		//LDAPResult modifyResult = ldap.modify("dn:cn=007������005,ou=��1��,ou=IT�����,ou=�����, o=government of korea,c=kr", "changetype : modify", "add:sn", "sn : lee ");
		Modification mod = new Modification(ModificationType.ADD,"sn","lee");
		System.out.println(mod);
		ldap.close();
		
	}
	
	//�����ϴ� �޼ҵ� 
	public static void deleteSDK() throws LDAPException {
		LDAPConnection ldap = connectSDK();
		DeleteRequest deleteRequest = new DeleteRequest("cn=007������005,ou=��1��,ou=IT�����,ou=�����, o=government of korea,c=kr");
		ldap.delete(deleteRequest);
		System.out.println("������");
		ldap.close();
	}
	
} //class



