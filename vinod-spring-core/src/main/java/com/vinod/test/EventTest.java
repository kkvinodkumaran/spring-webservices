package com.vinod.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MySpringConifg.class);
		context.refresh();
		Customer cd = context.getBean(Customer.class);
		System.out.println(cd.getCustomer());

	}

}
