package com.vinod.test;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceLoaderTest {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MySpringConifg.class);
		context.refresh();
		MyResourceLoader resource = context.getBean(MyResourceLoader.class);
		Resource file = resource.getResource("classpath:vinod.txt");
		String theString = IOUtils.toString(file.getInputStream(), "UTF-8");
		System.out.println(theString);

	}

}
