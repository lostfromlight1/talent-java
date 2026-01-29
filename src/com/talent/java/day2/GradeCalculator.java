package com.talent.java.day2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;

        String[] subjects = {"English", "Math", "Science", "History", "Computer Science"};

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (0-100): ");
            double marks = Double.parseDouble(input.nextLine());

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--;
                continue;
            }

            total += marks;
        }

        double average = total / subjects.length;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nAverage Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
