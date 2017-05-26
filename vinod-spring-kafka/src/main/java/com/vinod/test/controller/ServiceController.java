package com.vinod.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.test.model.Customer;
import com.vinod.test.service.ServiceProvider;

/**
 * @author vinodkariyathungalkumaran
 *
 */
@RestController
public class ServiceController {
	private static final Logger logger = LoggerFactory.getLogger(ServiceController.class);
	@Autowired
	private ServiceProvider serviceProvider;

	@RequestMapping(method = RequestMethod.POST, value = "/addCustomer")
	@ResponseBody
	public String addEmployee(@RequestBody Customer customer) {
		logger.info("Logging customer details..." + customer.toString());
		boolean status = serviceProvider.addCustomer(customer);
		if (status) {
			return "Customer details successfully sent";
		} else {
			return "Customer details failed to sent";

		}

	}
}
