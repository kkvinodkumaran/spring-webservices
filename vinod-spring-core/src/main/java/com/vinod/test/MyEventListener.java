package com.vinod.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class MyEventListener implements ApplicationListener<ApplicationEvent> {		
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("Current Event is "+ applicationEvent.getClass().getName() + " received!");		
	}

}
