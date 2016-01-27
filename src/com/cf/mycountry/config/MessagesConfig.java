package com.cf.mycountry.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class MessagesConfig {
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource resourceBundleMessageSource()
	{
		
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("WEB-INF/messages/messages");
		messageSource.setDefaultEncoding("UTF-8");
		
		return messageSource;
	}
	
	
	public SessionLocaleResolver sessionLocaleResolver()
	{
		
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		Locale defaultLocale = Locale.forLanguageTag("en_US");
		sessionLocaleResolver.setDefaultLocale(defaultLocale);
		
		return sessionLocaleResolver;
		
	}

}
