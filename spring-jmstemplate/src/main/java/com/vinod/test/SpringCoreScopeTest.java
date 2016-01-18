package com.vinod.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreScopeTest {

	public static void main(String arg[]) {
		// Getting beans from XML based bean configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
		// Student bean
		Student obj = (Student) context.getBean("studentBean");
		obj.setName("vinod");
		System.out.println(obj.getName());
		

	}
}
