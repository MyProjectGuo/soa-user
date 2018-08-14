package com.dubbo.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String getUserById(Long userId) {
		
		return "你好，这是第一个dubbo服务提供者";
	}

}
