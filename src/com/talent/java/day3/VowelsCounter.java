package com.talent.java.day3;

import java.util.Scanner;

public class VowelsCounter {

    public static void main(String[] args) {

        try (Scanner myInput = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = myInput.nextLine();

            if (word == null || word.isEmpty()) {
               throw new Exception("Input cannot be empty");
            }

            int vowels = countVowels(word);
            System.out.println("Number of vowels in the word is: " + vowels);

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

    }

    public static int countVowels(String input) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char ch : input.toLowerCase().toCharArray()) {
            for (char v : vowels) {
                if (ch == v) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
