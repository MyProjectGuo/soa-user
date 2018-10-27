package com.dubbo.user.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.user.dao.UserMapper;
import com.dubbo.user.model.User;
import com.dubbo.user.model.UserExample;
import com.dubbo.user.service.UserService;

@Service(group = "userService", version = "1.0.0")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private AmqpTemplate amqpTemplate;

	@Override
	@Transactional
	public User getUserById(Long userId) {

		User user = userMapper.selectByPrimaryKey(1L);
		return user;
	}

	@Override
	public User findByUserName(String userName) {
		UserExample example = new UserExample();
		example.createCriteria().andMobileEqualTo(userName);
		List<User> list = userMapper.selectByExample(example);
		return CollectionUtils.isEmpty(list) ? null : list.get(0);
	}

	@Override
	public void sendUserMQ() {
		String message = "你好：" + new Date();
		amqpTemplate.convertAndSend("exchange","top.message", message);
	}

}
