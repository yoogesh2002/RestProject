package com.cf.mycountry.Utility;

import java.util.Iterator;
import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MycountryRequestContextInfoHelper

{
	
	public void retriveRequestContextInfo()
	{
		try
		{
			InitialContext context = new InitialContext();
			 BeanManager beanManager =  (BeanManager) context.lookup("java:comp/BeanManager");
			 
			 MycountryRequestContextInfo transientRequestContextInfo = new MycountryRequestContextInfo();
				Set<Bean<?>> matchingBeans = beanManager.getBeans(MycountryRequestContextInfo.class);
				
				if(matchingBeans !=null)
				{
					Iterator<Bean<?>> iterator = matchingBeans.iterator();
					
					if(iterator.hasNext())
					{
						Bean<?> matchingBean = iterator.next();
						CreationalContext<?> beanCreationContext = beanManager.createCreationalContext(matchingBean);
						
						MycountryRequestContextInfo persistentRequestContextInfo = (MycountryRequestContextInfo)beanManager.getReference(matchingBean, MycountryRequestContextInfo.class, beanCreationContext);
				
						String transactionId = persistentRequestContextInfo.getTransactionId();
						String IpAddress = persistentRequestContextInfo.getIpAddress();
						String browserAgent = persistentRequestContextInfo.getBrowserAgent();
						String trigerredId = persistentRequestContextInfo.getTriggeredById();
						
						transientRequestContextInfo.setTransactionId(transactionId);
						transientRequestContextInfo.setIpAddress(IpAddress);
						transientRequestContextInfo.setBrowserAgent(browserAgent);
						transientRequestContextInfo.setTriggeredById(trigerredId);	
						
					}
		       }
		} catch (NamingException ex){ };
		
	
		
		
	}
	



	
}
