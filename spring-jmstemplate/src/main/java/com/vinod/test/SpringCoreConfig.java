package com.vinod.test;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringCoreConfig {
	@Bean

	public Student getStudentBean() {
		Student stud = new Student();
		stud.setName("Vinod");
		return stud;
	}
}
