package com.pluarslight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);


        System.out.println("Full Name:");
        String FullName = input.nextLine();

        System.out.println("Full Date:");
        String dateInput = input.nextLine();
        LocalDate date = LocalDate.parse(dateInput);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Number of tickets:");
        int tickets = input.nextInt();

        String[] names = FullName.split(" ");
        String firstName = names[0];
        String lastName = names.length > 1 ? names[1] : "";

        String ticketWord = tickets == 1 ? "ticket" : "tickets";

        System.out.println(tickets + " " + ticketWord +
                " reserved for " + date + " under " + lastName +
                ", " + firstName);
    }









}
