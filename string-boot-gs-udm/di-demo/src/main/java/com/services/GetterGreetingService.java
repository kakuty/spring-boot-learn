package com.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello - injected by getter";
	}

}
