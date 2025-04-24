package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        //Take the user's name input in parts: first, middle, last, and suffix.
        System.out.println("Enter your full name");

        System.out.println("First name:");
        String firstName = scanner.nextLine().trim();

        System.out.println("Middle name:");
        String middleName = scanner.nextLine().trim();

        System.out.println("Last name ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Suffix");
        String suffix = scanner.nextLine().trim();

        //create full name
        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;


            System.out.println("Full name: " + fullName);
        }








    }
}
