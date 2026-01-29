package com.talent.java.day1;

import java.time.LocalDate;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your name: ");
        String myName = userInput.nextLine();

        System.out.println("Hello, World!");

        LocalDate today = LocalDate.now();
        System.out.println("Name: " + myName);
        System.out.println("Date: " + today);
    }
}
