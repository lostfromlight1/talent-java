package com.talent.java.day5.Books;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public void makeDiscount(int percent) {
        double discountAmount = price * percent / 100.0;
        price = price - discountAmount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println(
                "\nTitle: " + title +
                        "\nAuthor: " + author +
                        "\nPrice: " + price
        );
    }
}
