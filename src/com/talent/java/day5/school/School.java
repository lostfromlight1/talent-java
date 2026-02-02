package com.talent.java.day5.school;

public class School {
    public static void main(String[] args) {

        Person[] people = {
                new Student("Aung", 16, 10),
                new Teacher("Ms. May", 35, "Math")
        };

        for (Person person : people) {
            person.introduce();
            System.out.println("Role: " + person.getRole());
            System.out.println();
        }
    }
}
