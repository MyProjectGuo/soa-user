package com.dubbo.user.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dubbo.user.SoaUserApplication;
import com.dubbo.user.model.User;
import com.dubbo.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SoaUserApplication.class)
public class UserServiceImplTest {

	@Autowired
	private UserService userServiceImpl;
	
	@Autowired
	@Qualifier("stringRedisTemplate")
	private StringRedisTemplate template;
	

	@Test
	public void testGetUserById() {
		User user = userServiceImpl.getUserById(1L);
		System.out.println(user.getLoginName());
	}
	
	@Test
	public void testRedis(){
		
		template.opsForValue().set("test1", "321321");
	}
	
	@Test
	public void testSendMQ(){
		userServiceImpl.sendUserMQ();
		
	}

}
