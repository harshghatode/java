package com.wipro.java.interface1;

public class Main {
    public static void main(String[] args) {
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();

        obj1.display(); // Output: This is Dog
        obj2.display(); // Output: This is cat
    }
}
