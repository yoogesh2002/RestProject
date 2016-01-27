package com.cf.mycountry.filter;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cf.mycountry.Utility.MycountryRequestContextInfo;

public class MycountryRequestContextInfoFilter implements Filter {

	@Inject
	private MycountryRequestContextInfo MycountryRequestContextInfo;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException 
	{
	
		
	}


	
	@Override
	public void doFilter(ServletRequest baseRequest, ServletResponse baseResponse, FilterChain filterChain)throws IOException, ServletException 
    {
	
		 HttpServletRequest  request = (HttpServletRequest) baseRequest;
		 HttpServletResponse response = (HttpServletResponse) baseResponse;

		 String clientIpaddress = "192.168.1.20";
		 String browserAgent = "Monzila firefox";
		 String transactionId = "123324";
		 
		 
		 MycountryRequestContextInfo.setIpAddress(clientIpaddress);
		 MycountryRequestContextInfo.setBrowserAgent(browserAgent);
		 MycountryRequestContextInfo.setTransactionId(transactionId);
		 
		 filterChain.doFilter(request, response);
		 
	}


	
	
	@Override
	public void destroy()
	{
		
	}

}
