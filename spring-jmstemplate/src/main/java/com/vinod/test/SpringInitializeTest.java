package com.vinod.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInitializeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core-application-context.xml");
		
		//Employee bean 
		Employee obj = (Employee) context.getBean("employeeBean");
		obj.setName("vinod-->Employee");
		System.out.println(obj.getName());
		
		//Customer bean
		
		Customer customer = (Customer) context.getBean("customer");
		customer.setName("vinod-->Customer");
		System.out.println(customer.getName());
	}

}
