package com.talent.java.day5.school;

public class School {
    public static void main(String[] args) {

        Person student = new Student("Aung", 16, 10);
        Person teacher = new Teacher("Ms. May", 35, "Math");

        student.introduce();
        System.out.println("Role: " + student.getRole());
        System.out.println();

        teacher.introduce();
        System.out.println("Role: " + teacher.getRole());
        System.out.println();
    }
}
