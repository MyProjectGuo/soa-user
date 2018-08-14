package com.dubbo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-reference.xml"})
public class SoaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaUserApplication.class, args);
	}
}
