package com.talent.java.day7.homework1.customexception;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message){
        super(message);
    }
}
