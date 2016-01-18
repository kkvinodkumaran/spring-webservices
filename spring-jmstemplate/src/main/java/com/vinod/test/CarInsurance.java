package com.vinod.test;

public class CarInsurance {
	private String name;
	private String policyDetails;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPolicyDetails() {
		return policyDetails;
	}
	public void setPolicyDetails(String policyDetails) {
		this.policyDetails = policyDetails;
	}
	@Override
	public String toString() {
		return "CarInsurance [name=" + name + ", policyDetails=" + policyDetails + "]";
	}

}
