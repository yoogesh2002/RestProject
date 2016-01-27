package com.cf.mycountry.redirection;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;


public class RedirectPathBuilder {
	
	
	private static final String ORIGINAL_REQUEST_URL_ATTRIBUTE_NAME = "originalRequestUrl";
	private static final String AUTHENTICATION_STATE_ATTRIBUTE_NAME="authenticationState";
	
	public static String buildRedirectpath(HttpServletRequest request, String requestedpath) 
	{
		
		String redirectpath = null;
		
		try
		 { 
			   URI uri = new URI(requestedpath);
			
		        if(uri.isAbsolute())
		          {
			        redirectpath = "redirect:" + requestedpath;	
		          }
		
		        else
		          {
			         	 String servletpath = request.getServletPath();
			         	 servletpath = StringUtils.removeEnd(servletpath, "/");
			         	 if(requestedpath.startsWith("/"))
			         	   {
			         		 redirectpath = "redirect:" + servletpath + requestedpath;
			         	   }
			
			         	 else
			         	   {
			         		 redirectpath = "redirect:" + servletpath + "/" + requestedpath;
			         	   }
			
		           }
		
		}
		
        catch (URISyntaxException e) 
		{
        	e.getMessage();
		}
		
	
		return redirectpath;
		
	}
	
	
	
	public static String buildOriginalRequestUrlRedirectPath(HttpServletRequest request, String requestedPath) 
	{
		String redirectPath = null;
		HttpSession session = request.getSession();
		
		if(session !=null)
		{
			String originalRequestUrl = (String)session.getAttribute(ORIGINAL_REQUEST_URL_ATTRIBUTE_NAME);
			redirectPath = buildRedirectpath(request, originalRequestUrl);
		}
		
		else
		{
			redirectPath = buildRedirectpath(request, requestedPath);
		}
		
		
		return redirectPath;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
