package com.wipro.java.oops.abstraction;

public abstract class car {

	
	 public abstract void drive();

	    // Concrete method (common to all cars)
	    public void startEngine() {
	        System.out.println("Engine started.");
	    }

}
