package com.dubbo.user.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dubbo.user.SoaUserApplication;
import com.dubbo.user.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SoaUserApplication.class)
public class UserServiceImplTest {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@Test
	public void testGetUserById() {
		User user = userServiceImpl.getUserById(1L);
		System.out.println(user.getLoginName());
	}

}
