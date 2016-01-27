package com.cf.mycountry.authenticationHelper;

public enum RequiredAuthenticationType {
	
	UNPROTECTED("Unprotected"),
	USERNAME_PASSWORD_AUTHENTICATION_ONLY("Username and password authentication only"),
	TWO_FACTOR_AUTHENTICATION("Two factor authentication");
	
	private final String description;
	
	private RequiredAuthenticationType(String description)
	{
		this.description = description;
	}
	
	public String toString()
	{
		return description;
	}
	

}
