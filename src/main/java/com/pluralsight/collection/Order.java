package com.pluralsight.collection;

import java.util.Scanner;

public interface Order {
    Scanner scanner = new Scanner(System.in);
    //double price = 0;

    static void order() {
        boolean exit = false;


        while (!exit) {
            System.out.println("-------------------------------");
            System.out.println("What would you like to order?");
            System.out.println("1) Sandwich");
            System.out.println("2) Drink");
            System.out.println("3) Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.println("-------------------------------");


            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    boolean anotherSandwich = true;
                    while (anotherSandwich) {
                        Sandwich.buildSandwich();


                        System.out.println("Would you like another sandwich? Y/N");

                        String answer = scanner.nextLine();
                        if (answer.equalsIgnoreCase("N")) {
                            anotherSandwich = false;
                        }

                    }


                    break;
                case 2:
                    Drink.size();
                    Drink.totalDrink();
                    break;
                case 3:
                    Chip.chips();
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Command not an option, please chose 1-4.");
                    break;


            }//  scanner.close();
        }
        System.out.println("Thank you and goodbye");
    }


}


