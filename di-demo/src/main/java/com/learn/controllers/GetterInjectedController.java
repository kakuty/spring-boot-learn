package com.learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.services.GreetingService;
import com.services.GreetingServiceImpl;

@Controller
public class GetterInjectedController {
	GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
