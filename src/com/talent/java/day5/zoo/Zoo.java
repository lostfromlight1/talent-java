package com.talent.java.day5.zoo;

import com.talent.java.day5.zoo.animals.*;

public class Zoo {
    public static void main(String[] args) {

        Animal lion1 = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal lion2 = new Lion("Nala", 4);

        lion1.displayInfo();
        lion1.makeSound();

        elephant.displayInfo();
        elephant.makeSound();

        lion2.displayInfo();
        lion2.makeSound();
    }
}
