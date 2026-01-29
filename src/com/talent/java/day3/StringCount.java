package com.talent.java.day3;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = myInput.nextLine();
        int letters = countLetter(word);
        int digits = countDegit(word);
        int specialChars = countSpecial(word);
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specialChars);
    }

    public static int countLetter(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }

        }
        return count;
    }

    public static int countDegit(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }

        }
        return count;
    }

    public static int countSpecial(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                count++;
            }

        }
        return count;
    }
}
