package com.wipro.java.collection.hashmap;

import java.util.HashMap;

public class CustomHashMap {
    public static void main(String[] args) {
        // Create a HashMap that maps String keys to Integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 22);
        map.put("Maria", 28);

        // Access elements from the HashMap
        System.out.println("John's age: " + map.get("John"));
        System.out.println("Alice's age: " + map.get("Alice"));

        // Check if a key exists in the HashMap
        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }

        // Remove a key-value pair from the HashMap
        map.remove("Maria");

        // Iterate through the HashMap
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get the size of the HashMap
        System.out.println("Total number of entries: " + map.size());
    }
}