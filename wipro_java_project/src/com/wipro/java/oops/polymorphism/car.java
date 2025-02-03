package com.wipro.java.oops.polymorphism;

public class car {
	private String brandName;
	private String Model;
	
	public String getBrandName() {
		return brandName;

	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public void showdetails() {
		System.out.println("Brand: "+getBrandName()+" Model: "+getModel());
	}


}
