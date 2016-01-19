package com.vinod.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CustomerDetails {
	@Autowired
	Customer customer;
	public Customer getCustomerDetails() {
		return customer;
	}
}
