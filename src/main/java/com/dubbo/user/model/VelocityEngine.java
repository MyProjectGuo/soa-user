package com.dubbo.user.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class VelocityEngine {
	
	@Bean
	@Primary
	public org.apache.velocity.app.VelocityEngine getVelocityEngine(){
		return new org.apache.velocity.app.VelocityEngine();
	}

}
