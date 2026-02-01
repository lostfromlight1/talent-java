package com.talent.java.day5.zoo.animals;

public class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " Mooo! ");
    }
}
