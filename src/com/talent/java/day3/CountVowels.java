package com.talent.java.day3;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = myInput.nextLine();
        int vowels =countVowels(word);
        System.out.println("Number of vowels in the word is: "+ vowels );
    }
    public static int countVowels(String input){
        int count = 0;
        for(int i=0; i < input.length() ; i++){
            char ch = input.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) {
                count++;
            }
        }
        return count;
    }
}
