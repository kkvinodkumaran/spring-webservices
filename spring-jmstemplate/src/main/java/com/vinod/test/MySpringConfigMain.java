package com.vinod.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringConfigMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MySpringConifg.class);
		context.refresh();
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
	}

}
