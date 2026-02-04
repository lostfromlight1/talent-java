package com.talent.java.day7.homework3.guest;


import com.talent.java.day7.homework3.customexception.*;

import java.util.HashSet;

public class GuestService {

    public static void addGuest(HashSet<String> guests, String name) {
        if (guests.add(name)) {
            System.out.println(name + " added to the guest list.");
        } else {
            System.out.println(name + " is already in the guest list.");
        }
    }

    public static void displayGuests(HashSet<String> guests) {
        if (guests.isEmpty()) {
            System.out.println("Guest list is empty.");
        } else {
            System.out.println("Current guests:");
            for (String name : guests) {
                System.out.println(name);
            }
        }
    }

    public static boolean isGuestPresent(HashSet<String> guests, String name) {
        return guests.contains(name);
    }

    public static void removeGuest(HashSet<String> guests, String name)
            throws GuestNotFoundException {

        if (!guests.remove(name)) {
            throw new GuestNotFoundException(name + " is not in the guest list.");
        } else {
            System.out.println(name + " has been removed from the guest list.");
        }
    }

    public static int totalGuests(HashSet<String> guests) {
        return guests.size();
    }
}
