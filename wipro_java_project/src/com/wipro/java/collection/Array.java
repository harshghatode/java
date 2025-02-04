package com.wipro.java.collection;

public class Array {

	 public static void main(String[] args) {
	        // Step 1: Declare an array of integers
	        int[] Array;

	        // Step 2: Initialize the array with a size of 5
	        Array = new int[5];

	        // Step 3: Assign values to the array elements
	        Array[0] = 10;
	        Array[1] = 20;
	        Array[2] = 30;
	        Array[3] = 40;
	        Array[4] = 50;

	        // Step 4: Access and print array elements using a for loop
	        System.out.println("Array elements:");
	        for (int i = 0; i < Array.length; i++) {
	            System.out.println("Element at index " + i + ": " + Array[i]);
	        }

	        // Step 5: Alternatively, use an enhanced for loop (for-each loop)
	        System.out.println("\nArray elements using for-each loop:");
	        for (int num : Array) {
	            System.out.println(num);
	        }
	    }

}
