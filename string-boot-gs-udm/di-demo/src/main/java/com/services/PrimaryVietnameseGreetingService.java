package com.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("vi")
@Primary
public class PrimaryVietnameseGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Xin chao - Viet Nam";
	}
	
}
