package com.talent.java.day7.homework1;

import com.talent.java.day7.homework1.customexception.DuplicateStudentException;
import com.talent.java.day7.homework1.customexception.StudentNotFoundException;
import com.talent.java.day7.homework1.student.Student;
import com.talent.java.day7.homework1.student.StudentService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        try {
            StudentService.addStudent(students, new Student(1, "Aung Aung"));
            StudentService.addStudent(students, new Student(2, "Mg Mg"));
            StudentService.addStudent(students, new Student(3, "Su Su"));
            StudentService.addStudent(students, new Student(4, "Kyaw Kyaw"));
            StudentService.addStudent(students, new Student(5, "Thanlwin"));

            System.out.println("All Students:");
            for (Student student : students) {
                student.display();
            }

            System.out.println("\nSearch Result:");
            Student found = StudentService.searchByName(students, "Su Su");
            found.display();

            StudentService.removeById(students, 2);
            System.out.println("\nStudent removed successfully.");

            System.out.println("\nTotal students: " + students.size());

        } catch (DuplicateStudentException e) {
            System.out.println("Duplicate Error: " + e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println("Not Found Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
