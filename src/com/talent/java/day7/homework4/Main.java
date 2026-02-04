package com.talent.java.day7.homework4;

import com.talent.java.day7.homework4.customexception.StudentNotFoundException;
import com.talent.java.day7.homework4.studentmark.StudentMarksService;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        try {
            StudentMarksService.addStudent(students, "Aung", 85);
            StudentMarksService.addStudent(students, "Bob", 92);
            StudentMarksService.addStudent(students, "Charlie", 78);
            StudentMarksService.addStudent(students, "Diana", 90);
            StudentMarksService.addStudent(students, "Ethan", 88);

            System.out.println("----------------------");

            StudentMarksService.dispalyAll(students);

            System.out.println("----------------------");

            StudentMarksService.highestMark(students);

            System.out.println("----------------------");

            StudentMarksService.removeStudent(students, "Ethan");

            System.out.println("----------------------");

        } catch (StudentNotFoundException e) {
            System.out.println("Error: "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Unexcepted Error occured: "+ e.getMessage() );
        }
    }
}
