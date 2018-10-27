package com.dubbo.user.listener;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {
	
	@RabbitListener(queues="hello")
	@RabbitHandler
	public void process(Message message) throws UnsupportedEncodingException{
		
		System.out.println("用户消费者收听到队列消息："+new String(message.getBody(),"UTF-8"));
	}
	
	
	
	@RabbitListener(queues="top.qq")
	@RabbitHandler
	public void topicPocess(Message message) throws UnsupportedEncodingException{
		
		System.out.println("top.# 用户消费者收听到队列消息："+new String(message.getBody(),"UTF-8"));
	}
	
	@RabbitListener(queues="top.message")
	@RabbitHandler
	public void topicMessage(Message message) throws UnsupportedEncodingException{
		
		System.out.println("top.message 用户消费者收听到队列消息："+new String(message.getBody(),"UTF-8"));
	}
	
	
	
	
	

}
