package com.dismentoring.mypackage;

import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;

public class LDAPUnbound {
    
	public void connectSDK(String username, String password) throws LDAPException  {
		// UnboundID SDK�� �̿��Ͽ� LDAP ������ ���� 
		LDAPConnection ldap = new LDAPConnection("192.168.0.60",389,"cn=govmanager","GOVmoi!manager");
	}
	
	
}
