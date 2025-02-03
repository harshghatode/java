package com.wipro.java.oops.polymorphism;

public class suv extends car{
	public void showdetails() {
		System.out.println("Brand Name: "+getBrandName());
		System.out.println("Model: "+getModel());
	}
	
	public static void main(String args[]) {
		car car = new Toyota();
		car.setBrandName("suv");
		car.setModel("M1");
		car.showdetails();;
	}

	

}
