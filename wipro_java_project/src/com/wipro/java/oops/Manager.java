package com.wipro.java.oops;

public class Manager extends Employee  {
	// Employee = parent class
		// Manager = child class
		// extends = keyword

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
public static  void main(String a[]) {
		
		// child object is instantiated from child constructor
		// parent class consumes the properties and behaviour of child class
		 
		Employee employee = new Manager();
		employee.setId(1000);
		employee.setName("chetan");
		employee.setSalary(35000);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

}
}
