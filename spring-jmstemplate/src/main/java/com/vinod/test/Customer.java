package com.vinod.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean, DisposableBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroying");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean starting");
	}

}
