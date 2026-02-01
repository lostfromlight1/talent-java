package com.talent.java.day5.zoo.animals;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " roars! ");
    }
}
