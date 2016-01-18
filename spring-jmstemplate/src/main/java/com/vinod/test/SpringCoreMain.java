package com.vinod.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCoreMain {

	public static void main(String[] args) {

		// Getting beans from XML based bean configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
		// Student bean
		Student obj = (Student) context.getBean("studentBean");
		obj.setName("vinod");
		System.out.println(obj.getName());

		// Getting beans from Annotaion based configuration

		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext();
		anno.register(SpringCoreConfig.class);
		anno.refresh();
		Student stu = anno.getBean(Student.class);
		System.out.println(stu.getName());
	}

}
