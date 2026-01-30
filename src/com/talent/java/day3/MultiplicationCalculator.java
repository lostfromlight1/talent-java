package com.talent.java.day3;

public class MultiplicationCalculator {
    public static void main(String[] args) {
        try {
            int result1 = multiply(2, 3);
            int result2 = multiply(4, 5, 6);

            System.out.println("Multiply 2 number: " + result1);
            System.out.println("Multiply 3 number: " + result2);

        }catch (ArithmeticException e){
            System.out.println("Math Error occurred: "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Unexpected Error: "+ e.getMessage());
        }finally {
            System.out.println("Program Finished!");
        }

    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
