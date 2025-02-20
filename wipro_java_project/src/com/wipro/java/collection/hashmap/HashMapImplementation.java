package com.wipro.java.collection.hashmap;



public class HashMapImplementation {
    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();

        // Insert key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(12, "Charlie"); // Collision (since 12 % 10 == 2)

        // Display HashMap
        map.display();

        // Get value by key
        System.out.println("\nGet Key 2: " + map.get(2)); // Output: Bob

        // Remove a key
        map.remove(2);
        System.out.println("\nAfter removing key 2:");
        map.display();

        // Check if key exists
        System.out.println("\nContains Key 12? " + map.containsKey(12)); // true

        // Print size
        System.out.println("Size of HashMap: " + map.size()); // 2
    }
}