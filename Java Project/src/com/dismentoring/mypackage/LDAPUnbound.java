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
    
	// UnboundID SDK를 이용하여 LDAP 서버에 연결 
	public static LDAPConnection connectSDK() throws LDAPException    {
		
		LDAPConnection ldap = new LDAPConnection("192.168.0.60",389,"cn=govmanager","GOVmoi!manager");
		return ldap;
		
	}
    
	// 조회하는 메소드 
	public static void searchSDK() throws LDAPException {
		LDAPConnection ldap = connectSDK();
		String filter = "cn=007이진형002";
		SearchRequest searchRequest = new SearchRequest("c=kr",SearchScope.SUB,filter);
		System.out.println(searchRequest);
		SearchResult searchResult = ldap.search(searchRequest);
		System.out.println(searchResult);
		ldap.close();
	}
	
	//추가하는 메소드 
	public static void addSDK() throws LDAPException, LDIFException {
		LDAPConnection ldap = connectSDK();
		LDAPResult addResult =  ldap.add("dn:cn=007이진형005,ou=제1과,ou=IT감사단,ou=감사원, o=government of korea,c=kr", "objectClass: top", "objectClass: user", "cn:jin");
		System.out.println(addResult);
		ldap.close();
		
	}
	
	//수정하는 메소드
	public static void modifySDK() throws LDAPException, LDIFException {
		LDAPConnection ldap = connectSDK();
		//LDAPResult modifyResult = ldap.modify("dn:cn=007이진형005,ou=제1과,ou=IT감사단,ou=감사원, o=government of korea,c=kr", "changetype : modify", "add:sn", "sn : lee ");
		Modification mod = new Modification(ModificationType.ADD,"sn","lee");
		System.out.println(mod);
		ldap.close();
		
	}
	
	//삭제하는 메소드 
	public static void deleteSDK() throws LDAPException {
		LDAPConnection ldap = connectSDK();
		DeleteRequest deleteRequest = new DeleteRequest("cn=007이진형005,ou=제1과,ou=IT감사단,ou=감사원, o=government of korea,c=kr");
		ldap.delete(deleteRequest);
		System.out.println("삭제됨");
		ldap.close();
	}
	
} //class



