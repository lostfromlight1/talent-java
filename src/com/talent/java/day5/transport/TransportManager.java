package com.talent.java.day5.transport;

import com.talent.java.day5.transport.vehicles.*;

public class TransportManager {
    public static void main(String[] args) {

       Vehicle[] fleet = {
                new Car("Japan", 2022, 50),
                new Motorcycle("USA", 2021, 20),
                new Car("Germany", 2023, 60)
        };

        for (Vehicle vehicle : fleet) {
            System.out.println("Type: " + vehicle.getVehicleType());
            vehicle.startEngine();
            vehicle.drive();
            vehicle.refuel(10);
            System.out.println("--------------------");
        }

        System.out.println("Total Vehicles Created: " + Vehicle.getTotalVehicles());
    }
}
