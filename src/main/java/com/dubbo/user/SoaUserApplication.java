package com.dubbo.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.dubbo.user.dao")
@ImportResource(value = {"classpath:dubbo-reference.xml"})
public class SoaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaUserApplication.class, args);
	}
}
