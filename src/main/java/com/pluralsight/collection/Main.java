package com.pluralsight.collection;

import static com.pluralsight.collection.Order.scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to DELI-cious!");
        System.out.println("Would you like to start an order?");
        System.out.println("---------------------------------");
        System.out.println("1) New Order.");
        System.out.println("0) Exit.");
        System.out.println("---------------------------------");
        switch (scanner.nextInt()){
            case 1:
                Order.order();
                break;
            default:
                System.out.println("Command not an option Please select 1 or 0.");

        }
    }
}