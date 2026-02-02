package com.talent.java.day5.transport.vehicles;

public class Vehicle {

    private String country;
    private int year;
    private double fuelLevel;
    private String vehicleType;

    private static int totalVehicles = 0;

    public Vehicle(String country, int year, double fuelLevel) {
        this.country = country;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.vehicleType = "Vehicle";
        totalVehicles++;
    }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getFuelLevel() { return fuelLevel; }
    public void setFuelLevel(double fuelLevel) { this.fuelLevel = fuelLevel; }

    public void startEngine() {
        System.out.println("The vehicle engine starts.");
    }

    public void drive() {
        System.out.println("The vehicle is driving.");
    }

    public void refuel(double amount) {
        this.fuelLevel += amount;
        System.out.println("Refueled. Current fuel level: " + fuelLevel);
    }

    public String getVehicleType() {
        return vehicleType;
    }

    protected void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }
}