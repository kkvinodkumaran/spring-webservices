package com.vinod.test.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAOPMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MySpringAOPConifg.class);
		context.refresh();
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.getName());

	}

}
