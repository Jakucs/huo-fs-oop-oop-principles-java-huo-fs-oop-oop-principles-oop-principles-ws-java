package com.codecool.animal;

// --- Task 7
// TODO: There is no existing class that is a direct instance of Animal.
// Animal just a grouping concept for all animals in our zoo.

// The general blueprint for all animals in our zoo.
public class Animal {

    // --- Task 1
    // TODO: name, age fields should not be accessible from outside the Animal class.
    //  Change their visibility to protect them. Also, add a public "getter" method
    //  for the 'name' field so other classes can read it.
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- Task 2
    // TODO: Every animal must make a sound, but each does it differently.
    //  This method should define the CONCEPT of making a sound without
    //  implementing it.
    public void makeSound() {
        System.out.println("Animal sound");
    }
}
