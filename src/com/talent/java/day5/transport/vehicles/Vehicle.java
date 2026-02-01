package com.talent.java.day5.transport.vehicles;

public class Vehicle {

    protected String country;
    protected int year;
    protected double fuelLevel;
    protected String vehicleType;

    protected static int totalVehicles = 0;

    public Vehicle(String country, int year, double fuelLevel) {
        this.country = country;
        this.year = year;
        this.fuelLevel = fuelLevel;
        totalVehicles++;
    }

    public void startEngine() {
        System.out.println("The vehicle engine starts.");
    }

    public void drive() {
        System.out.println("The vehicle is driving.");
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueled. Current fuel level: " + fuelLevel);
    }

    public String getVehicleType() {
        return "Vehicle";
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }
}
