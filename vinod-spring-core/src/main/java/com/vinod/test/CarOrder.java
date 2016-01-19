package com.vinod.test;

public class CarOrder {

	private String carDetails;
	private CarInsurance carInsurance;
	public CarOrder(CarInsurance carInsurance) {
		super();
		this.carInsurance = carInsurance;
	}	
	public CarOrder() {}
//Getters and setters
	
	public String getCarDetails() {
		return carDetails;
	}
	public void setCarDetails(String carDetails) {
		this.carDetails = carDetails;
	}
	public CarInsurance getCarInsurance() {
		return carInsurance;
	}
	public void setCarInsurance(CarInsurance carInsurance) {
		this.carInsurance = carInsurance;
	}
	
	@Override
	public String toString() {
		return "CarOrder [carDetails=" + carDetails + ", carInsurance=" + carInsurance + "]";
	}
	
}
