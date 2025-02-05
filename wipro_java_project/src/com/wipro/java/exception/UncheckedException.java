package com.wipro.java.exception;

public class UncheckedException {

	public static void main(String[] args) {
        try {
            // Trying to divide by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }

    // Method that throws an unchecked exception
    public static int divide(int a, int b) {
        return a / b; // This line can throw ArithmeticException
    }

}
