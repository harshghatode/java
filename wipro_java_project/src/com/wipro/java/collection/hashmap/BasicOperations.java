package com.wipro.java.collection.hashmap;

import java.util.HashMap;

public class BasicOperations {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 1. Add elements to the HashMap
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Orange", 80);

        System.out.println("Initial HashMap: " + map);

        // 2. Access elements from the HashMap
        int applePrice = map.get("Apple");
        System.out.println("Price of Apple: " + applePrice);

        // 3. Change or update the value of an existing key
        map.put("Banana", 60); // Updating the price of Banana
        System.out.println("Updated price of Banana: " + map.get("Banana"));

        // 4. Remove an element from the HashMap
        map.remove("Orange");
        System.out.println("HashMap after removing Orange: " + map);

        // Check if a key or value exists in the HashMap
        if (map.containsKey("Apple")) {
            System.out.println("Apple exists in the HashMap");
        }

        if (map.containsValue(60)) {
            System.out.println("There is a fruit with the price 60");
        }
    }
}
