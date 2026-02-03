package com.talent.java.day5.transport.vehicles;

public class Motorcycle extends Vehicle {

    public Motorcycle(String country, int year, double fuelLevel) {
        super(country, year, fuelLevel);
        setVehicleType("Motorcycle");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starts");
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle is driving. Fuel level: " + getFuelLevel());
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}