package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
             
	public static void main(String[] args) {
        // Step 1: Create the first list (l1)
        List<Integer> l1 = new ArrayList<>();
        l1.add(10); // Add element 10
        l1.add(20); // Add element 20
        l1.add(30); // Add element 30

        // Step 2: Create the second list (l2)
        List<Integer> l2 = new ArrayList<>();
        l2.add(40); // Add element 40
        l2.add(50); // Add element 50

        // Step 3: Print the initial lists
        System.out.println("Initial l1: " + l1);
        System.out.println("Initial l2: " + l2);

        // Step 4: Add all elements of l2 into l1 at index 1
        l1.addAll(1, l2);
        System.out.println("After l1.addAll(1, l2): " + l1);

        // Step 5: Remove the element at index 1 from l1
        l1.remove(1);
        System.out.println("After l1.remove(1): " + l1);

        // Step 6: Update the element at index 0 to 5
        l1.set(0, 5);
        System.out.println("After l1.set(0, 5): " + l1);
    }
	
}
