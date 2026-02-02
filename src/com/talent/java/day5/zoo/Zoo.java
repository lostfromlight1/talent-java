package com.talent.java.day5.zoo;


import com.talent.java.day5.zoo.animals.*;

public class Zoo {
    public static void main(String[] args) {

        Animal[] animals = {
                new Lion("Simba", 5),
                new Elephant("Dumbo", 10),
                new Lion("Nala", 4)
        };

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
        }
    }
}

