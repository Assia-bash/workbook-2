package com.pluarslight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user information
        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine().trim();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine().trim();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine().trim();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine().trim();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine().trim();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine().trim();

        // Build output using StringBuilder
        StringBuilder output = new StringBuilder();

        output.append(fullName).append("\n");
        output.append("Billing Address:\n");
        output.append(billingStreet).append("\n");
        output.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");
        output.append("Shipping Address:\n");
        output.append(shippingStreet).append("\n");
        output.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        // Display the result
        System.out.println("\nCustomer Information:");
        System.out.println(output);
    }
}
