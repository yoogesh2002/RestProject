package com.cf.mycountry.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class Dispatchersecurityfiler implements Filter {
	
	
	private static final String ORIGINAL_REQUEST_URL_ATTRIBUTE_NAME = "originalRequestUrl";
	private static final String AUTHENTICATION_STATE_ATTRIBUTE_NAME="authenticationState";
	
	private RequestMappingHandlerMapping requestMappingHandlerMapping;

	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException 
	{
		ServletContext servletContext = filterConfig.getServletContext();
		WebApplicationContext springWebApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		requestMappingHandlerMapping = springWebApplicationContext.getBean(RequestMappingHandlerMapping.class);
	}
	
	

	@Override
	public void doFilter(ServletRequest baseRequest, ServletResponse baseResponse, FilterChain filterChain) throws IOException, ServletException 
	{
		
		
	}
	
	@Override
	public void destroy()
	{
	
		
	}

	
	
}
