package com.talent.java.day7.homework3.customexception;

public class GuestNotFoundException extends Exception {
    public GuestNotFoundException(String message){
        super(message);
    }
}
