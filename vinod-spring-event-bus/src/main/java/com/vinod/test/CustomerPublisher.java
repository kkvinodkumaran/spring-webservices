package com.vinod.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.bus.EventBus;

@Service
public class CustomerPublisher {

	@Autowired
	EventBus eventBus;

	public void publishCustomerDetails() throws InterruptedException {
		Customer customer = new Customer();
		customer.setName("vinod");
		customer.setAddress("Sasi area");
		eventBus.notify("customer", Event.wrap(customer));
		System.out.println("Message sent");
	}

}