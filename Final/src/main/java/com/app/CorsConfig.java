package com.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{

	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/ekisan/**")
	                .allowedOrigins("https://ekisan.netlify.app")
	                .allowedMethods("GET", "POST", "PUT", "DELETE")
	                .allowedHeaders("*");
	        registry.addMapping("/products/**")
		            .allowedOrigins("https://ekisan.netlify.app")
		            .allowedMethods("GET", "POST", "PUT", "DELETE")
		            .allowedHeaders("*");
	        
	    }
	 
	 
}
