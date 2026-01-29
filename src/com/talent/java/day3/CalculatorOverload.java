package com.talent.java.day3;

public class CalculatorOverload {
    public static void main(String[] args) {
        int result1 = multiply(2 , 3);
        int result2 = multiply(4 , 5 , 6);

        System.out.println("Multiply 2 number: "+ result1);
        System.out.println("Multiply 3 number: "+ result2);
    }
    public static int multiply(int a , int b){
        return a * b;
    }
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }
}
