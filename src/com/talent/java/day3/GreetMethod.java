package com.talent.java.day3;

import java.util.Scanner;

public class GreetMethod {
    public static void main(String[] args) {
        try {
            greet();
            Scanner input = new Scanner(System.in);
            System.out.print("Tell me your name: ");
            String myName = input.nextLine();
            if (myName == null || myName.isEmpty()) {
                throw new Exception("Input cannot be empty");
            }
            greet(myName);
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

    }

    public static void greet() {
        System.out.println("Hello! ");
    }

    public static void greet(String name) {
        System.out.println("Hello! " + name);
    }
}
