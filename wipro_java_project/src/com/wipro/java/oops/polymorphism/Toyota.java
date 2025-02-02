package com.wipro.java.oops.polymorphism;

public class Toyota extends car {

	public void showdetails() {
		System.out.println("Brand Name: "+getBrandName());
		System.out.println("Model: "+getModel());
	}
	public static void main(String args[]) {
		car car = new Toyota();
		car.setBrandName("Toyota");
		car.setModel("F4");
		car.showdetails();;
	}

}
