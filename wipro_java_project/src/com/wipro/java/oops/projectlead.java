package com.wipro.java.oops;

public class projectlead extends Employee{
	// Employee = parent class
	// projectlead = child class
	// extends = keyword

	public projectlead() {
		// TODO Auto-generated constructor stub
	}
public static  void main(String a[]) {
		
		// child object is instantiated from child constructor
		// parent class consumes the properties and behaviour of child class
		 
		Employee employee = new developer();
		employee.setId(1500);
		employee.setName("Vaibhav");
		employee.setSalary(48000);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

}
}
