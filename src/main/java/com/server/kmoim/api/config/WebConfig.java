package com.server.kmoim.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * Web Config
 * @author kkazzong
 * 
 * */
@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	/**
	 * global CORS 셋팅
	 * */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") 
        		.allowedOrigins("*") 
				.allowedMethods("*")
                .allowedHeaders("*");
    }
	
}
