package com.talent.java.day5.school;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm " + getName() + ", age " + getAge() + ", and I teach " + subject + ".");
    }

    @Override
    public String getRole() {
        return "Teacher";
    }
}