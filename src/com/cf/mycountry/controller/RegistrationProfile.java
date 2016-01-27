package com.cf.mycountry.controller;

import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cf.mycountry.CoreServiceClient.ProfileService;
import com.cf.mycountry.model.Profile;
import com.cf.mycountry.redirection.RedirectPathBuilder;

@Controller
public class RegistrationProfile {
	
	@Autowired
	ProfileService profileService; 
	
	/*
	 * This is Straight forward.
	 */
	
	@RequestMapping (value="/Registration", method = RequestMethod.GET)
	public String Registerprofile(HttpServletRequest request) throws URISyntaxException
	{
		String redirectpath = null;
		redirectpath = RedirectPathBuilder.buildRedirectpath(request, "/registration-email-send-otp");
		
		return redirectpath;
		
	}
	
	
	
	
	
	/* here, before redirecting to the my-Account page, we will check whether the user is already in
	 * our authentication state. if yes, then instead of redirect him to the my-account.jsp page, redirect
	 * him to the page where he was before.
	 */
	
	@RequestMapping (value="/Myaccount", method = RequestMethod.GET)
	private String myAccount(HttpServletRequest request) 
	{
		
		String redirectpath = null;
		Profile profile = null;
		
		
		profile = profileService.getProfile();
		redirectpath = RedirectPathBuilder.buildRedirectpath(request, "/my-account");
		
		return redirectpath;
	}
	
	

}
