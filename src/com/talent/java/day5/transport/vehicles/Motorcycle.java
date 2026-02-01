package com.talent.java.day5.transport.vehicles;

public class Motorcycle extends Vehicle {

    public Motorcycle(String country, int year, double fuelLevel) {
        super(country, year, fuelLevel);
        this.vehicleType = "Motorcycle";
    }

    public void startEngine() {
        System.out.println("Motorcycle engine start");
    }

    public void drive() {
        System.out.println("The motorcycle start driving");
    }

    public String getVehicleType() {
        return "Motorcycle";
    }
}
