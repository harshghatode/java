package com.wipro.java.exception;

public class CheckedUncheckedException {

	public static void main(String[] args) {
        // Unchecked Exception Example (ArithmeticException)
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }

        // Checked Exception Example (FileNotFoundException)
        try {
            java.io.FileInputStream file = new java.io.FileInputStream("nonexistent.txt"); // File doesn't exist
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }
    }
}
