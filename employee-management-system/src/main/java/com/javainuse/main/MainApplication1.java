package com.javainuse.main;

import com.javainuse.domain.Person;

public class MainApplication1 {
    public static void main(String[] args) {
        // Using the Lombok-generated constructor
        Person person = new Person("Alice", 30);
        
        // Using Lombok-generated getter and setter
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Lombok-generated toString method
        System.out.println("Person Details: " + person.toString());

        // Changing the name using the setter
        person.setName("Bob");
        System.out.println("Updated Person Details: " + person.toString());
    }
}
