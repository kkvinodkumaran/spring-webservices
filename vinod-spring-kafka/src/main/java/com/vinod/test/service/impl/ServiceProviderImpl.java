package com.vinod.test.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.vinod.test.model.Customer;
import com.vinod.test.service.ServiceProvider;

@Service
public class ServiceProviderImpl implements ServiceProvider {
	private static final Logger logger = LoggerFactory.getLogger(ServiceProviderImpl.class);
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	@PostConstruct
	public void executePostConstruct() {
		logger.info("Executing executePostConstruct method ServiceProviderImpl");
	}
	public boolean addCustomer(Customer customer){
		boolean status=false;
		try{
			logger.info("Executing executePostConstruct method to post messsages to kafka");
			Gson gson=new Gson();
			String customerString=gson.toJson(customer);
			kafkaTemplate.send("testtopic", customerString);
			status=true;
		}catch(Exception e){
			logger.error("Exception during logging customer details",e);
			status=false;
		}
		return status;
	}


}
