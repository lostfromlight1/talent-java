package com.talent.java.day7.homework1.customexception;

public class DuplicateStudentException extends Exception{
    public DuplicateStudentException(String message){
        super(message);
    }
}
