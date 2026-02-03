package com.talent.java.day5.PayRoll;

public abstract class Employee {
    private String name ;
    private int id ;

    Employee (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        return "Employee ID: " + id +
                "\n Name: " + name +
                "\n Monthly Pay: " + calculatePay();
    }
}
