package com.learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learn.services.GreetingServiceImpl;

@Controller
public class GetterInjectedController {
	GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	public void setGreetingService(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}

}
