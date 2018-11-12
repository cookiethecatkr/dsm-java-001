package com.dismentoring.mypackage;

import com.unboundid.ldap.sdk.DN; 
// added jar file to the library
import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.*;

public class LDAPUnbound {
    
	public boolean connectLDAP(String username, String password) {
		
		boolean success = false; 
	
		
	
		LDAPConnection ldapConnection null; 
		String loginDn = getLoginDn(username); 
		
		if (loginDn != null) {
			try { 
				ldapConnection = getUserConnection(loginDn, password); 
				if(ldapConnection != null) { 
					success = true; 
				}
			}
			catch (Exception e) {
				LOG.error(e.getMessage(), e);
			}
			finally {
				if (ldapConnection !=null) {
					ldapConnection.close();
				}
			}
		}
		
		
	}
	
	
}
