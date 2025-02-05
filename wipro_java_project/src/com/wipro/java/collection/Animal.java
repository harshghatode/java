package com.wipro.java.collection;

public class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override toString for better output
    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }

    // Implement Comparable (natural ordering by name)
    @Override
    public int compareTo(Animal other) {
        return this.name.compareTo(other.name);
    }
}
