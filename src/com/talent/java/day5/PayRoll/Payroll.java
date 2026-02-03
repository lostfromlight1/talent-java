package com.talent.java.day5.PayRoll;

public class Payroll {
    public static void main(String[] args) {

        Employee[] employees = {
                new HourlyEmployee("Aung", 101, 4000, 45),
                new SalariedEmployee("May", 102, 1200000)
        };

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("\n-----------------------\n");
        }
    }
}
