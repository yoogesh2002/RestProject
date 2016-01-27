package com.cf.mycountry.authenticationHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.cf.mycountry.model.Profile;

public class Authentication_Decision {
	
	private static final String AUTHENTICATION_STATE_ATTRIBUTE_NAME="authenticationState";
	
	public static void affirmAuthenticatedUsernamePassword(HttpServletRequest request, Profile profile)
	{
		HttpSession session = request.getSession();
		AuthenticationState authenticationState = (AuthenticationState) session.getAttribute(AUTHENTICATION_STATE_ATTRIBUTE_NAME);
		
		if(authenticationState == null) 
			
		{ 
			authenticationState = new AuthenticationState();
		}
		
		authenticationState.setGuid(profile.getGuid());
		authenticationState.setAuthenticatedUsernamePassword(true);
		authenticationState.setAuthenticatedOtp(false);
		authenticationState.setLastLoginDate(profile.getLastLoginDate());
		
		session.setAttribute(AUTHENTICATION_STATE_ATTRIBUTE_NAME, authenticationState);
		
     }
	
	
	
	public static void denyAuthenticatedUsernamePassword(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		AuthenticationState authenticationState = (AuthenticationState) session.getAttribute(AUTHENTICATION_STATE_ATTRIBUTE_NAME);
		
		if(authenticationState == null) 
			
		{ 
			authenticationState = new AuthenticationState();
		}
		
		authenticationState.setAuthenticatedUsernamePassword(false);
		session.setAttribute(AUTHENTICATION_STATE_ATTRIBUTE_NAME, authenticationState);
		
	}
	

}
