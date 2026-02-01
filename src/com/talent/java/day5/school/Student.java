package com.talent.java.day5.school;

public class Student extends Person {

    private int gradeLevel;

    public Student(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    public void introduce() {
        System.out.println("Hi, I'm student " + name + ", age " + age + ", in grade " + gradeLevel + ".");
    }

    public String getRole() {
        return "Student";
    }
}

