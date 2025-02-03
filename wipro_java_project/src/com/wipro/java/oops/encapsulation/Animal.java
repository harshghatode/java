package com.wipro.java.oops.encapsulation;

public class Animal {

	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		 if (age > 0) { // Validation to ensure age is positive
	            this.age = age;
	        } else {
	            System.out.println("Invalid age! Age must be greater than 0.");
	        }
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	// Private attributes
    private String name;
    private int age;
    private String species;

}
