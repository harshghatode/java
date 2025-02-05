package com.wipro.java.collection;

import java.util.*;

public class Collection {
        
	public static void main(String[] args) {
        // Array example
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        System.out.println("Array elements:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ArrayList example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // LinkedList example
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList elements:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map elements:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
