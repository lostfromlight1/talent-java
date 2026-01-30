package com.talent.java.day3;

public class PrimeNumCounter {

    public static void main(String[] args) {

        try {
            System.out.println("Prime numbers between 1 and 100:");

            for (int i = 1; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }

            int[] numbers = {2, 4, 5, 6, 7, 9, 11, 15, 17};
            int total = countPrime(numbers);

            System.out.println("\nThe number of prime numbers in the array is: " + total);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }
    }

    public static boolean isPrime(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Negative numbers cannot be checked for prime.");
        }

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int[] arr) throws Exception {
        if (arr == null) {
            throw new Exception("Input array cannot be null.");
        }

        int primeCount = 0;

        for (int num : arr) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        return primeCount;
    }
}
