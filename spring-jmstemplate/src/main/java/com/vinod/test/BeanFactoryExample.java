package com.vinod.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class BeanFactoryExample {

	public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
                "spring-core.xml"));
        Student obj = (Student) factory.getBean("studentBean");
        System.out.println(obj.getClass().getName());
	}

}
