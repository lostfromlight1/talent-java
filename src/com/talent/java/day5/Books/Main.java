package com.talent.java.day5.Books;


public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "Kyaw Kyaw", 30000);
        Book b2 = new Book("OOP in Java", "Johon", 45000);
        Book b3 = new Book("Clean Code", "Mars", 60000);

        System.out.println("Before Discount:");
        b1.display();
        b2.display();
        b3.display();

        b1.makeDiscount(10);
        b2.makeDiscount(20);
        b3.makeDiscount(15);

        System.out.println("\n-----------------------");
        System.out.println("\nAfter Discount:");
        b1.display();
        b2.display();
        b3.display();
    }
}
