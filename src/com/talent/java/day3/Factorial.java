package com.talent.java.day3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = Integer.parseInt(input.nextLine());

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(n);
            System.out.println(n + "! = " + fact);
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
