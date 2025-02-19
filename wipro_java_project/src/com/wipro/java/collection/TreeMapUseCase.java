package com.wipro.java.collection;



import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapUseCase {

    public static void main(String[] args) {
        // Step 1: Create a TreeMap instance
        // TreeMap stores data in a sorted order based on keys.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding some sample data to the TreeMap
        map.put(1, "Harsh");
        map.put(3, "sagar");
        map.put(5, "Ramesh");
        map.put(2, "Preeti");
        map.put(4, "Pratik");

        // Step 2: Displaying data from TreeMap
        // TreeMap automatically sorts the data based on the key (in ascending order).
        System.out.println("Data from TreeMap (sorted by key):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Adding a separator for readability
        System.out.println("\n-----------------------------\n");

        // Step 3: Creating a HashMap instance
        // HashMap stores data in an unordered fashion based on the key.
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Step 4: Transferring data from TreeMap to HashMap
        // We use the putAll() method to copy all entries from the TreeMap to HashMap.
        hashMap.putAll(map);

        // Step 5: Displaying data from HashMap
        // Note: The data in HashMap may not maintain any specific order (unordered).
        System.out.println("Data from HashMap (unordered):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
    }
}
