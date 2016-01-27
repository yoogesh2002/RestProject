package com.cf.mycountry.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.cf.mycountry.Interceptors.AuthenticationStateBeanHandlerInterceptor;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setExposeContextBeansAsAttributes(true);
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/view");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	
	public void addResouceHandlers(ResourceHandlerRegistry registry)
	{
		registry
		     .addResourceHandler("/static/**")
		            .addResourceLocations("/static/");
	}
	
	
	public void configurDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
	{
		// allow the container to handle the requests that are not handled by spring
		
		configurer.enable();
	}
	
	
	public void addInterceptors(InterceptorRegistry registry)
	{
		AuthenticationStateBeanHandlerInterceptor authenticationStateBeanHandlerInterceptor = new AuthenticationStateBeanHandlerInterceptor();
		registry.addInterceptor((HandlerInterceptor) authenticationStateBeanHandlerInterceptor);
	}
	
	

}
