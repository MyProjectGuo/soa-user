package com.dubbo.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.user.dao.UserMapper;
import com.dubbo.user.model.User;
import com.dubbo.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(Long userId) {

		User user = userMapper.selectByPrimaryKey(1L);
		return user;
	}

}
