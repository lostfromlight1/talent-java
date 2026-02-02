package com.talent.java.day5.school;

public class Student extends Person {

    private int gradeLevel;

    public Student(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm student " + getName() + ", age " + getAge() + ", in grade " + gradeLevel + ".");
    }

    @Override
    public String getRole() {
        return "Student";
    }
}