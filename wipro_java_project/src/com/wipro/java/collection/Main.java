package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Tiger", 3));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Zebra", 7));

        // Sort by name (using Comparable)
        Collections.sort(animals);
        System.out.println("Sorted by name (Comparable):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Sort by age (using Comparator)
        Collections.sort(animals, new AgeComparator());
        System.out.println("\nSorted by age (Comparator):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}