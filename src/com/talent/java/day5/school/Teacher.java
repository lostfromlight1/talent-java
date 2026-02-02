package com.talent.java.day5.school;


public class Teacher extends Person {

    private final String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("Hello, I'm " + name + ", age " + age + ", and I teach " + subject + ".");
    }

    public String getRole() {
        return "Teacher";
    }
}
