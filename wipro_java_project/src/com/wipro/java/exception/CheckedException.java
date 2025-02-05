package com.wipro.java.exception;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CheckedException {

	 public static void main(String[] args) {
	        try {
	            // Trying to read a file that might not exist
	            readFile("test.txt");
	        } catch (FileNotFoundException e) {
	            System.out.println("Checked Exception: " + e.getMessage());
	        }
	    }

	    // Method that throws a checked exception
	    public static void readFile(String fileName) throws FileNotFoundException {
	        File file = new File(fileName);
	        Scanner scanner = new Scanner(file); // This line can throw FileNotFoundException
	        while (scanner.hasNextLine()) {
	            System.out.println(scanner.nextLine());
	        }
	        scanner.close();
	    }
}
