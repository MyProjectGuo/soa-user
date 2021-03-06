package com.dubbo.user.service;

import com.dubbo.user.model.User;

public interface UserService {
	
	User getUserById(Long userId);

	User findByUserName(String userName);
	
	void sendUserMQ();
}
