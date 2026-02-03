package com.talent.java.day5.PayRoll;

public class HourlyEmployee extends Employee{

    HourlyEmployee(String name, int id, double hourlyRate,int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    private double hourlyRate;
    private int hoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        } else {
            int overtimeHours = hoursWorked - 40;
            double normalPay = 40 * hourlyRate;
            double overtimePay = 2 * hourlyRate * overtimeHours;
            return normalPay + overtimePay;
        }
    }

    @Override
    public String toString() {
        return "Hourly Employee | ID: " + getId() +
                "\nName: " + getName() +
                "\nHours: " + hoursWorked +
                "\nRate: " + hourlyRate +
                "\nMonthly Pay: " + calculatePay();
    }
}
