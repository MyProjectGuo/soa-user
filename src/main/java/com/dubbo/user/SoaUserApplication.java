package com.dubbo.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.dubbo.user.dao")
@ImportResource(value = {"classpath:dubbo-reference.xml"})
@EnableTransactionManagement
@EnableCaching
public class SoaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaUserApplication.class, args);
	}
}
