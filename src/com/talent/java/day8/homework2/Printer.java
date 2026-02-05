package com.talent.java.day8.homework2;

import java.util.ArrayList;

public class Printer<T> {

    private ArrayList<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}
