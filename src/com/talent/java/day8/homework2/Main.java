package com.talent.java.day8.homework2;

public class Main {

    public static void main(String[] args) {

        Printer<Integer> intPrinter = new Printer<>();
        intPrinter.add(10);
        intPrinter.add(20);
        intPrinter.add(30);

        System.out.println("Integer values:");
        intPrinter.printAll();

        System.out.println();

        Printer<Double> doublePrinter = new Printer<>();
        doublePrinter.add(1.5);
        doublePrinter.add(2.75);
        doublePrinter.add(3.25);

        System.out.println("Double values:");
        doublePrinter.printAll();
    }
}
