package com.talent.java.day3;

import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {

        try (Scanner myInput = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = myInput.nextLine();

            if (word == null || word.isEmpty()) {
               throw new Exception("Input should not be empty");
            }

            int totalLetters = countLetters(word);
            int totalDigits = countDigits(word);
            int totalSpecialChars = countSpecialCharacters(word);

            System.out.println("Letters: " + totalLetters);
            System.out.println("Digits: " + totalDigits);
            System.out.println("Special characters: " + totalSpecialChars);

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }finally {
            System.out.println("Program Finished");
        }
    }

    public static int countLetters(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpecialCharacters(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }
}
