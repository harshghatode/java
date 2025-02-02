package com.wipro.java.oops.encapsulation;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an instance of Animal
        Animal myAnimal = new Animal();

        // Set values using setter methods
        myAnimal.setName("Buddy");
        myAnimal.setAge(5);
        myAnimal.setSpecies("Dog");

        // Get values using getter methods
        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Age: " + myAnimal.getAge());
        System.out.println("Species: " + myAnimal.getSpecies());

        // Try to set an invalid age
        myAnimal.setAge(-3); // This will trigger the validation in the setter method

	}

}
