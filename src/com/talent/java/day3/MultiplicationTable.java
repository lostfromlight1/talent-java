package com.talent.java.day3;

public class MultiplicationTable {
    public static void main(String[] args) {
        printTable(13, 12);
    }

    public static void printTable(int number, int row) {
        for (int i = 1; i <= row; i++) {
            System.out.println(number + "* " + i + "= " + (number * i));
        }
    }
}
