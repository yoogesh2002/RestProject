package com.cf.mycountry.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages=("com.cf"))
@Import(value={MessagesConfig.class, ValidatorConfig.class, WebConfig.class})
public class AppConfig {
	
	
	// This class if bootstrap for spring component scanning and annotation based configuration.

}
