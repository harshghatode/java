package com.wipro.java.exception;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Input two values from the user
    	int num1=3, num2=0;
        
        
        try {
            // Attempt to perform division
            int result = num1/num2;
            System.out.println("Result of division: " + result);
        } catch (Exception e) {
            // Handle the division by zero exception
            System.out.println(e.toString());
       
        } finally {
            System.out.println("Execution complete.");
        }
        System.out.println("rest of code");
    }  
}