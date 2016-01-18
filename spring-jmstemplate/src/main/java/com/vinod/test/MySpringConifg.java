package com.vinod.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; 

@Configuration
public class MySpringConifg {
	@Bean
	public Employee getEmployeeBean() {
		Employee emp = new Employee();
		emp.setName("Vinod");
		emp.setAddress("Bangalore");
		return emp;
	}
}
