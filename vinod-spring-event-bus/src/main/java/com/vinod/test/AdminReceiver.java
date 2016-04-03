package com.vinod.test;
import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.fn.Consumer;

@Service
public class AdminReceiver implements Consumer<Event<Customer>> {

	public void accept(Event<Customer> ev) {
		System.out.println("Message received in Admin.. Customer details ::" + ev.getData());
	}

}
