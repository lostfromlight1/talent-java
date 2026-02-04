package com.talent.java.day7.homework1.student;

import com.talent.java.day7.homework1.customexception.*;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    public static void addStudent(ArrayList<Student> studentList, Student student)
            throws DuplicateStudentException {

        if (student.getId() <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }

        for (Student s : studentList) {
            if (s.getId() == student.getId()) {
                throw new DuplicateStudentException(
                        "Duplicate Student ID: " + student.getId());
            }
        }

        studentList.add(student);
    }

    public static Student searchByName(ArrayList<Student> studentList, String name)
            throws StudentNotFoundException {

        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }

        throw new StudentNotFoundException(
                "Student with name '" + name + "' not found"
        );
    }

    public static void removeById(ArrayList<Student> studentList, int id)
            throws StudentNotFoundException {

        Iterator<Student> it = studentList.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            if (s.getId() == id) {
                it.remove();
                return;
            }
        }

        throw new StudentNotFoundException(
                "Student with ID " + id + " not found"
        );
    }
}
