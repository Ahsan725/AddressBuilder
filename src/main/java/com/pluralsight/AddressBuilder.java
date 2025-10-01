package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //get the user's name since we will only need it once I will keep it outside the method
        String name;
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        //we will call the method twice one for shipping and one for billing.
        //There is a lot of repetitive code, so I put it in a reusable method.
        var billingAddress = addressBuilder("billing");
        var shippingAddress = addressBuilder("shipping");

        //printing results
        System.out.println(name + "\n\n" + billingAddress + "\n\n" + shippingAddress);
    }

    public static String addressBuilder(String addType){
        //all variables
        var result = new StringBuilder(); //I will return it as a string at the end
        String city;
        String state;
        String zip;
        String address;

        System.out.println("Please provide the following information: ");
        result.append("This is the " + addType + " address: " + "\n");

        System.out.println("Enter " + addType + " Street: ");
        result.append(sc.nextLine());
        result.append("\n");

        System.out.println("Enter " + addType + " City: ");
        result.append(sc.nextLine());
        result.append(", ");

        System.out.println("Enter " + addType + " State: ");
        result.append(sc.nextLine());
        result.append(", ");

        System.out.println("Enter " + addType + " zip: ");
        result.append(sc.nextLine());

        return result.toString();
    }
}
