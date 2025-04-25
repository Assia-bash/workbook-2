package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        // Split into first and last name
        String[] nameParts = fullName.split("\\s+");
        if (nameParts.length < 2) {
            System.out.println("Please enter both first and last name.");
            return;
        }
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Get date
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String inputDate = scanner.nextLine().trim();
        LocalDate reservationDate;
        try {
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
            reservationDate = LocalDate.parse(inputDate, inputFormatter);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
            return;
        }

        // Get number of tickets
        System.out.print("How many tickets would you like? ");
        int ticketCount = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Confirmation message
        String ticketWord = (ticketCount == 1) ? "ticket" : "tickets";
        System.out.println(ticketCount + " " + ticketWord + " reserved for " +
                reservationDate + " under " + lastName + ", " + firstName);
    }
}










