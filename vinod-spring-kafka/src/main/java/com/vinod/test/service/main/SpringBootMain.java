package com.vinod.test.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author vinodkariyathungalkumaran
 *
 */
@SpringBootApplication
@ComponentScan({ "com.vinod.test" })
public class SpringBootMain {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMain.class, args);
	

	}

}
