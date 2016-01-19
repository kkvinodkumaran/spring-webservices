package com.vinod.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MySpringConifg.class);
		context.refresh();
		CustomerDetails cd = context.getBean(CustomerDetails.class);
		System.out.println(cd.getCustomerDetails().getCustomer());
	}

}
