package com.pluarslight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder address = new StringBuilder();
        System.out.println("Please provide the following information:");
        System.out.println("Full name:");
        String fullName = scanner.nextLine();
        address.append(fullName).append("\n");

        String addressInfo = "Billing Address:";
        addressInfo.append("Billing Address:\n");
        System.out.println("Billing Street:");
        String BillingStreet = scanner.nextLine();

        System.out.println("BillingCity:");
        String BillingCity = scanner.nextLine();

        System.out.println("BillingState:");
        String BillingState = scanner.nextLine();

        System.out.println("BillingZip:");
        String BillingZip = scanner.nextLine();

        address.append(BillingCity)
                .append(", ").append(BillingState)
                .append(" ").append(BillingZip)
                .append("\n");

        address.append("Shipping Address:\n");
        System.out.print("Shipping Street: ");
        address.append(scanner.nextLine()).append("\n");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        address.append(shippingCity)
                .append(", ")
                .append(shippingState)
                .append(" ")
                .append(shippingZip);

        System.out.println("\n--- Customer Information ---");
        System.out.println(address);
    }
}







    }
}
