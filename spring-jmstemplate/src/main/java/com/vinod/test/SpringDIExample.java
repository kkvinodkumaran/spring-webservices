package com.vinod.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDIExample {

	public static void main(String[] args) {

		// Test Setter based dependency injection
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-di-core.xml");

		CarOrder cardOder = (CarOrder) context.getBean("carOrder");
		System.out.println(cardOder);

		// Test Constructor based dependency injection

		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-di-core.xml");

		CarOrder cardOder1 = (CarOrder) context1.getBean("carOrder1");
		System.out.println(cardOder1);
	}

}
