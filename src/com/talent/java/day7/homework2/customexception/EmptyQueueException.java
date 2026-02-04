package com.talent.java.day7.homework2.customexception;

public class EmptyQueueException extends Exception{
    public EmptyQueueException(String message){
        super(message);
    }
}
