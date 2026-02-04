package com.talent.java.day7.homework3;

import com.talent.java.day7.homework3.customexception.GuestNotFoundException;
import com.talent.java.day7.homework3.guest.*;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> guests = new HashSet<>();

        try {
            GuestService.addGuest(guests, "Aung");
            GuestService.addGuest(guests, "Sara");
            GuestService.addGuest(guests, "John");
            GuestService.addGuest(guests, "Aung");
            GuestService.addGuest(guests, "Mary");
            GuestService.addGuest(guests, "Bob");

            System.out.println();

            GuestService.displayGuests(guests);
            System.out.println();

            String checkGuest = "Aung";
            if (GuestService.isGuestPresent(guests, checkGuest)) {
                System.out.println(checkGuest + " is on the guest list.");
            } else {
                System.out.println(checkGuest + " is NOT on the guest list.");
            }

            System.out.println();

            GuestService.removeGuest(guests, "John");

            System.out.println();

            GuestService.displayGuests(guests);
            System.out.println("\nTotal guests: " + GuestService.totalGuests(guests));

        } catch (GuestNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
