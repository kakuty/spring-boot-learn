package com.learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learn.services.GreetingServiceImpl;

@Controller
public class ConstructorInjectedController {
	GreetingServiceImpl greetingService;

	@Autowired
	public ConstructorInjectedController(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
