package com.talent.java.day5.transport.vehicles;

public class Car extends Vehicle {

    public Car(String country, int year, double fuelLevel) {
        super(country, year, fuelLevel);
        setVehicleType("Car");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starts.");
    }

    @Override
    public void drive() {
        System.out.println("The car is driving. Fuel level: "+ getFuelLevel());
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}