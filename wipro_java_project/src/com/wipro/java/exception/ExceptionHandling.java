package com.wipro.java.exception;


import java.util.Scanner;  // Import the Scanner class

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two values from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            // Attempt to perform division
            int result = divide(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle the division by zero exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution complete.");
        }

        scanner.close();
    }

    // Method to perform division, throws ArithmeticException if dividing by zero
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b; // May throw ArithmeticException if b is 0
    }
}
