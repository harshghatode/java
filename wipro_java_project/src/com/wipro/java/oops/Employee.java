package com.wipro.java.oops;

public class Employee {

   private int id; // This is employee id
   private String name; // This is employee name
   private String designation;// this is job designation
   public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

private float salary;//salary of employee

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
