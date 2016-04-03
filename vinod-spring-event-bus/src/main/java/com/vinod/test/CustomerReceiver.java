package com.vinod.test;
import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.fn.Consumer;

@Service
class CustomerReceiver implements Consumer<Event<Customer>> {

	public void accept(Event<Customer> ev) {
		System.out.println("Customer " + ev.getData());
	}

}
