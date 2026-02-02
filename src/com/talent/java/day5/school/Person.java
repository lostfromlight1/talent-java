package com.talent.java.day5.school;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " and I'm " + getAge() + " years old.");
    }

    public String getRole() {
        return "Person";
    }
}