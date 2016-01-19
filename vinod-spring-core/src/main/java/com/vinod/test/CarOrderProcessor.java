package com.vinod.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarOrderProcessor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-di-core.xml");
		CarOrder cardOder = (CarOrder) context.getBean("carOrder");
		System.out.println(cardOder);
		
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-di-core.xml");
		CarOrder cardOder1 = (CarOrder) context1.getBean("carOrder1");
		System.out.println(cardOder1);
	}

}
