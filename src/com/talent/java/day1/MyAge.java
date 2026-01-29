package com.talent.java.day1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MyAge {
    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int year = Integer.parseInt(userInput.nextLine());

        System.out.print("Enter your birth month: ");
        int month = Integer.parseInt(userInput.nextLine());

        System.out.print("Enter your birth date: ");
        int date = Integer.parseInt(userInput.nextLine());

        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, date);

        int myAge = Period.between(birthDate, currentDate).getYears();
        System.out.println("Your current age is: "+ myAge);

    }
}
