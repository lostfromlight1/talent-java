package com.talent.java.day7.collegedepartmentsystem.college;


import com.talent.java.day7.collegedepartmentsystem.customexception.StudentNotFoundException;

import java.util.*;


public class DepartmentService {

    public static void addStudent(List<String> students, Map<String, Set<String>> studentSubjects, String studentName) {
        if (!students.contains(studentName)) {
            students.add(studentName);
            studentSubjects.put(studentName, new HashSet<>());
            System.out.println(studentName + " added to the department.");
        } else {
            System.out.println(studentName + " already exists.");
        }
    }

    public static void addSubject(Map<String, Set<String>> studentSubjects, String studentName, String subject)
            throws StudentNotFoundException {
        if (!studentSubjects.containsKey(studentName)) {
            throw new StudentNotFoundException("Student " + studentName + " not found.");
        }
        studentSubjects.get(studentName).add(subject);
        System.out.println(subject + " added to " + studentName);
    }

    public static void removeSubject(Map<String, Set<String>> studentSubjects, String studentName, String subject)
            throws StudentNotFoundException {
        System.out.println("\n---Remove subject---");
        if (!studentSubjects.containsKey(studentName)) {
            throw new StudentNotFoundException("Student " + studentName + " not found.");
        }
        if (studentSubjects.get(studentName).remove(subject)) {
            System.out.println(subject + " removed from " + studentName);
        } else {
            System.out.println(studentName + " is not enrolled in " + subject);
        }
    }

    public static void displayAll(Map<String, Set<String>> studentSubjects) {
        System.out.println("\nDepartment Students and Subjects:");
        for (Map.Entry<String, Set<String>> entry : studentSubjects.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void displayAllUniqueSubjects(Map<String, Set<String>> studentSubjects) {
        Set<String> allSubjects = new HashSet<>();
        for (Set<String> subjects : studentSubjects.values()) {
            allSubjects.addAll(subjects);
        }
        System.out.println("\nAll subjects offered in the department: " + allSubjects);
    }
}
