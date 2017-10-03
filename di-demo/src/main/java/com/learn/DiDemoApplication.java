package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learn.controllers.ConstructorInjectedController;
import com.learn.controllers.GetterInjectedController;
import com.learn.controllers.MyController;
import com.learn.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		myController.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
