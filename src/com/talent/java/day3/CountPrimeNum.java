package com.talent.java.day3;

public class CountPrimeNum {
    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100:");

        for (int i = 1; i <= 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

        int[] numbers = {2, 4, 5, 6, 7, 9, 11, 15, 17};
        int total = countPrime(numbers);
        System.out.println("\nThe number of prime number in the int array is: "+ total);
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i= 2; i < n ; i ++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int[] n){
        int primeCount = 0;
        for(int num : n){
            if(isPrime(num)){
                primeCount++;
            }
        }
        return primeCount;
    }
}
