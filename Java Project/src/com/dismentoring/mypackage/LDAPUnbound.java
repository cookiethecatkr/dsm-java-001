package com.dismentoring.mypackage;

import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;

public class LDAPUnbound {
    
	public static void connectSDK()    {
		// UnboundID SDK�� �̿��Ͽ� LDAP ������ ���� 
		
		try {
		LDAPConnection ldap = new LDAPConnection("192.168.0.60",389,"cn=govmanager","GOVmoi!manager");
		System.out.println(ldap);
		} catch (LDAPException e) {
			e.printStackTrace();
			
		}
	}
	
	
}
