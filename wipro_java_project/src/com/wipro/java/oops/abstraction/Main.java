package com.wipro.java.oops.abstraction;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create objects of Sedan and SUV
        car sedan = new Sedan();
        car suv = new SUV();

        // Call methods
        sedan.startEngine();
        sedan.drive();

        suv.startEngine();
        suv.drive();

	}

}
