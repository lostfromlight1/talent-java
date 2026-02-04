package com.talent.java.day7.homework2.queue;

import com.talent.java.day7.homework2.customexception.*;


import java.util.LinkedList;

public class WaitingListService {

    public static void addPerson(LinkedList<String> list, String name) {
        list.addLast(name);
    }

    public static String servePerson(LinkedList<String> list)
            throws EmptyQueueException {

        if (list.isEmpty()) {
            throw new EmptyQueueException("No one is waiting to be served!");
        }

        return list.removeFirst();
    }

    public static void displayList(LinkedList<String> list) {
        if (list.isEmpty()) {
            System.out.println("Waiting list is empty.");
        } else {
            System.out.println("Current waiting list:");
            for (String name : list) {
                System.out.println(name);
            }
        }
    }

    public static int countPeople(LinkedList<String> list) {
        return list.size();
    }
}
