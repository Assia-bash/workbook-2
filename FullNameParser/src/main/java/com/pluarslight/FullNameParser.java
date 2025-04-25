package com.pluarslight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullInput = scanner.nextLine().trim();  // remove leading/trailing spaces

        String[] parts = fullInput.split("\\s+"); // split by 1+ spaces

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("Invalid format. Please enter either: first last OR first middle last.");
            return;
        }

        // Output parsed names
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}




