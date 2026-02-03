package com.talent.java.day5.PayRoll;

public class SalariedEmployee extends Employee{
    private double annualSalary ;
    SalariedEmployee(String name, int id, double annualSalary ){
        super(name,id);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

    @Override
    public String toString(){
        return "Salaried Employee | ID: " + getId()+
                "\nName: " + getName()+
                "\nAnnual Salary: " + annualSalary +
                "\nMonthly Pay: " + calculatePay();
    }

}
