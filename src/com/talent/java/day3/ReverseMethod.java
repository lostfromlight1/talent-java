package com.talent.java.day3;

import java.util.Scanner;

public class ReverseMethod {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = myInput.nextLine();
        System.out.println("Input: " + word);
        System.out.println("Result: " + reverse(word));
        myInput.close();
    }

    public static String reverse(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}
