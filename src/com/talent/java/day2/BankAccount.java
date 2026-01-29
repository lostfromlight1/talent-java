package com.talent.java.day2;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Bank Balance:");
        double balance = Double.parseDouble(input.nextLine());

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = Double.parseDouble(input.nextLine());

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                        System.out.println("New balance: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = Double.parseDouble(input.nextLine());

                    if (withdraw <= balance && withdraw > 0) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Remaining balance: $" + balance);
                    } else {
                        System.out.println("Insufficient funds or invalid amount!");
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        input.close();
    }
}
