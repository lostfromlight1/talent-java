package day1;

import java.util.Scanner;

public class MyName {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = userInput.nextLine();

        System.out.println("Normal");

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }

        System.out.println("Reverse");

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }

    }
}
