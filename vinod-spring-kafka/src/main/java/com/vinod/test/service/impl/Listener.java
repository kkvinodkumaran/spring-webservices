package com.vinod.test.service.impl;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author vinodkariyathungalkumaran
 *
 */
public class Listener {

	@KafkaListener(id = "vinod", topics = "testtopic", group = "group1")
	public void listen(ConsumerRecord<?, ?> record) {
		System.out.println(record);
		
	}
}
