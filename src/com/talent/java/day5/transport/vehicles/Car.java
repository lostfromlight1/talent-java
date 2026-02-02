package com.talent.java.day5.transport.vehicles;

public class Car extends Vehicle {

    public Car(String country, int year, double fuelLevel) {
        super(country, year, fuelLevel);
        setVehicleType("Car");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starts with a roar.");
    }

    @Override
    public void drive() {
        System.out.println("The " + getYear() + " car is driving.");
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}