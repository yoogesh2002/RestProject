package com.cf.mycountry.authenticationHelper;

import java.util.Date;

public class AuthenticationState {
	
	private String guid;
	private boolean AuthenticatedUsernamePassword;
	private boolean authenticatedOtp;
	private Date lastLoginDate;
	
	
	public AuthenticationState() {
		super();
	}


	public AuthenticationState(String guid, boolean authenticatedUsernamePassword, boolean authenticatedOtp,
			Date lastLoginDate) {
		super();
		this.guid = guid;
		AuthenticatedUsernamePassword = authenticatedUsernamePassword;
		this.authenticatedOtp = authenticatedOtp;
		this.lastLoginDate = lastLoginDate;
	}


	public String getGuid() {
		return guid;
	}


	public void setGuid(String guid) {
		this.guid = guid;
	}


	public boolean isAuthenticatedUsernamePassword() {
		return AuthenticatedUsernamePassword;
	}


	public void setAuthenticatedUsernamePassword(boolean authenticatedUsernamePassword) {
		AuthenticatedUsernamePassword = authenticatedUsernamePassword;
	}


	public boolean isAuthenticatedOtp() {
		return authenticatedOtp;
	}


	public void setAuthenticatedOtp(boolean authenticatedOtp) {
		this.authenticatedOtp = authenticatedOtp;
	}


	public Date getLastLoginDate() {
		return lastLoginDate;
	}


	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	
	
	
	

}
