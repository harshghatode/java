package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String args[]) {

        
        int n = 5;
        List<Integer> l1 = new LinkedList<>();

        // Adding elements to the LinkedList
        for (int i = 1; i <= n; i++) {
            l1.add(i);
        }

        // Printing the LinkedList elements
        System.out.println("LinkedList: " + l1);

        // Removing the element at index 3 (4th element in the list)
        l1.remove(3);
        System.out.println("LinkedList after removal: " + l1);

        // Printing elements one by one using a loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}