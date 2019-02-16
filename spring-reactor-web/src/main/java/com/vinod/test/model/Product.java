package com.vinod.test.model;

public class Product {

	
	public Product(String name, String description, String price, String yearOfManufacturing) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	private String name;
	private String description;
	private String price;
	private String yearOfManufacturing;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getYearOfManufacturing() {
		return yearOfManufacturing;
	}
	public void setYearOfManufacturing(String yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}
	
	
}
