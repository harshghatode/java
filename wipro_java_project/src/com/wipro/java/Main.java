/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
class MyClass {
    int num = 5;
 
    public void changeValue(int num) {
        this.num = num; //current class variable get changed to new one
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();// the object has been created
        obj.changeValue(10); //calling method
        System.out.println(obj.num); //it will print object of my class

	}

}

	/**
	 * 
	 */
	
