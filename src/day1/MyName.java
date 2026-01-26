package day1;

import java.util.Scanner;

public class MyName {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String myName = userInput.nextLine();

        System.out.println("Normal");

        for(int i = 0; i < myName.length(); i++){
            System.out.println(myName.charAt(i));
        }

        System.out.println("Reverse");

        for (int i = myName.length() - 1; i >= 0; i--) {
            System.out.println(myName.charAt(i));
        }

    }
}
