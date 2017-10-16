package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learn.examplebean.FakeDataSource;

@SpringBootApplication
public class SpringGsExternalPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringGsExternalPropertiesApplication.class, args);
		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource.getUsername());
	}
}
