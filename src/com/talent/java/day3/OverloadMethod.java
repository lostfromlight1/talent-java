package com.talent.java.day3;

import java.util.Scanner;

public class OverloadMethod {
    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String myName = input.nextLine();
        greet(myName);
    }

    public static void greet(){
        System.out.println("Hello! ");
    }

    public static void greet(String name){
        System.out.println("Hello! "+ name );
    }
}
