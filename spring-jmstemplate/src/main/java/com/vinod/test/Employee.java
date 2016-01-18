package com.vinod.test;

public class Employee {
private String name;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public void init() {
    System.out.println("Bean initializing");
} 

public void destroy() {
    System.out.println("Bean destroying");
}
}
