package com.vinod.test.aop;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	public String getName() {
		return "Raju";
	}

	public String getAddress() {
		return "Banaglore";
	}
}
