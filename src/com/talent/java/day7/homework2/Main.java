package com.talent.java.day7.homework2;

import com.talent.java.day7.homework2.customexception.*;
import com.talent.java.day7.homework2.queue.WaitingListService;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> waitingList = new LinkedList<>();

        try {
            WaitingListService.addPerson(waitingList, "Alice");
            WaitingListService.addPerson(waitingList, "Bob");
            WaitingListService.addPerson(waitingList, "Charlie");
            WaitingListService.addPerson(waitingList, "Diana");
            WaitingListService.addPerson(waitingList, "Ethan");

            WaitingListService.displayList(waitingList);

            String served = WaitingListService.servePerson(waitingList);
            System.out.println("\nServed: " + served);

            WaitingListService.addPerson(waitingList, "Fiona");

            System.out.println();
            WaitingListService.displayList(waitingList);

            System.out.println("\nTotal people waiting: " +
                    WaitingListService.countPeople(waitingList));

        } catch (EmptyQueueException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
