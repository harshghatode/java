package com.wipro.java.oops;

public class developer extends Employee {
	// Employee = parent class
		// developer = child class
		// extends = keyword
	public developer() {
		// TODO Auto-generated constructor stub
	}
	public static  void main(String a[]) {
		
		// child object is instantiated from child constructor
		// parent class consumes the properties and behaviour of child class
		 
		Employee employee = new developer();
		employee.setId(1234);
		employee.setName("harsh");
		employee.setSalary(40000);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

}
}