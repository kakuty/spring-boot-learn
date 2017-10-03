package com.learn.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("cn")
public class PrimaryChineseGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "你好 - 主要问候服务";
	}
	
}
