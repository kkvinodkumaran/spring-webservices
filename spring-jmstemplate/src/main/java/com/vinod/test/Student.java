package com.vinod.test;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
public class Student {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
