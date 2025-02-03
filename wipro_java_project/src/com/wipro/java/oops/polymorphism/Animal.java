package com.wipro.java.oops.polymorphism;

//Superclass
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }

 public static void main(String[] args) {
     // Creating objects of different subclasses but referencing them as Animal
     Animal myAnimal = new Animal();  // Animal object
     Animal myDog = new Dog();        // Dog object
     Animal myCat = new Cat();        // Cat object
     Animal myCow = new Cow();        // Cow object

     // Demonstrating polymorphism
     myAnimal.sound();  // Calls Animal's sound method
     myDog.sound();     // Calls Dog's overridden sound method
     myCat.sound();     // Calls Cat's overridden sound method
     myCow.sound();     // Calls Cow's overridden sound method
 }
}

//Subclass 1
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

//Subclass 2
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}

//Subclass 3
class Cow extends Animal {
 @Override
 void sound() {
     System.out.println("Cow moos");
 }
}
