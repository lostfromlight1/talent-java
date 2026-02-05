package com.talent.java.day8.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("10", "20", "abc", "30", "40x", "50");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String value : input ){
            try{
                int num = Integer.parseInt(value);
                numbers.add(num);
            }catch (NumberFormatException e){
                System.out.println("Invalid input: " + value);
            }
        }

        if (numbers.isEmpty()){
            System.out.println("No vaild input found");
            return;
        }

        int sum = 0;
        int min = numbers.get(0);
        int max = numbers.get(0);

        for (int n: numbers){
            sum += n;
            if(n < min){
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }
        double average = (double) sum / numbers.size();

        System.out.println("\nValid Integers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
