package com.talent.java.day7.collegedepartmentsystem;

import com.talent.java.day7.collegedepartmentsystem.college.DepartmentService;
import com.talent.java.day7.collegedepartmentsystem.customexception.StudentNotFoundException;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        Map<String, Set<String>> studentSubjects = new HashMap<>();

        try {
            System.out.println("---Adding student---");
            DepartmentService.addStudent(students, studentSubjects, "Aung");
            DepartmentService.addStudent(students, studentSubjects, "Bob");
            DepartmentService.addStudent(students, studentSubjects, "Charlie");

            System.out.println("\n---Adding subject to student---");
            DepartmentService.addSubject(studentSubjects, "Aung", "Math");
            DepartmentService.addSubject(studentSubjects, "Aung", "Physics");
            DepartmentService.addSubject(studentSubjects, "Aung", "Chemistry");

            DepartmentService.addSubject(studentSubjects, "Bob", "Biology");
            DepartmentService.addSubject(studentSubjects, "Bob", "Math");
            DepartmentService.addSubject(studentSubjects, "Bob", "History");

            DepartmentService.addSubject(studentSubjects, "Charlie", "English");
            DepartmentService.addSubject(studentSubjects, "Charlie", "Math");
            DepartmentService.addSubject(studentSubjects, "Charlie", "Physics");

            DepartmentService.displayAll(studentSubjects);

            DepartmentService.addSubject(studentSubjects, "Bob", "Geography");

            DepartmentService.removeSubject(studentSubjects, "Aung", "Chemistry");

            DepartmentService.displayAll(studentSubjects);

            DepartmentService.displayAllUniqueSubjects(studentSubjects);

        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
