package com.talent.java.day3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            String userInput = input.nextLine();

            if (userInput == null || userInput.isEmpty()) {
                throw new Exception("Input cannot be empty.");
            }

            int n = Integer.parseInt(userInput);

            if (n < 0) {
                throw new Exception("Factorial is not defined for negative numbers.");
            } else {
                long fact = factorial(n);
                System.out.println(n + "! = " + fact);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
