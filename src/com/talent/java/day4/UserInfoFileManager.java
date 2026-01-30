package com.talent.java.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class UserInfoFileManager {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter file name (without extension): ");
            String fileName = input.nextLine();

            File file = createFile(fileName);

            String userInfo = collectUserInfo(input);

            writeToFile(file, userInfo);

            System.out.print("Do you want to read the file? (1 = yes / 2 = no): ");
            int choice = Integer.parseInt(input.nextLine());

            if (choice == 1) {
                readFile(file);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nProgram Finished");
        }
    }

    public static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.trim().isEmpty()) {
            throw new Exception("File name cannot be empty");
        }

        File file = new File(fileName + ".txt");

        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists. Using existing file");
        }
        return file;
    }

    public static String collectUserInfo(Scanner input) throws Exception {

        System.out.println("\n=== Enter User Information ===");

        System.out.print("Full Name: ");
        String name = input.nextLine();

        System.out.print("Age: ");
        int age;
        try {
            age = Integer.parseInt(input.nextLine());
            if (age <= 0) {
                throw new Exception("Age must be a positive number.");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Age must be a number.");
        }

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Phone Number: ");
        String phone = input.nextLine();

        System.out.print("Address: ");
        String address = input.nextLine();

        if (name.isEmpty() || email.isEmpty()) {
            throw new Exception("Name and Email cannot be empty.");
        }

        return "\n----- USER INFORMATION -----\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Address: " + address + "\n";
    }

    public static void writeToFile(File file, String info) throws Exception {
        if (info == null || info.isEmpty()) {
            throw new Exception("Info cannot be empty");
        }

        FileWriter writer = new FileWriter(file);
        writer.write(info);
        writer.close();

        System.out.println("Information written successfully!");
    }

    public static void readFile(File file) throws Exception {
        if (!file.exists()) {
            throw new FileNotFoundException("File not found.");
        }

        System.out.println("\n--- File Content ---");

        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }
}
