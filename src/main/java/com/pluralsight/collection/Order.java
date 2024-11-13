package com.pluralsight.collection;

import java.util.Scanner;

public interface Order {
    Scanner scanner = new Scanner(System.in);
    //double price = 0;

    public static void order(){
        System.out.println("-------------------------------");
        System.out.println("What would you like to order?");
        System.out.println("1) Sandwich");
        System.out.println("2) Drink");
        System.out.println("3) Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        System.out.println("-------------------------------");

        switch (scanner.nextInt()){
            case 1:
                Sandwich.size();
                Sandwich.bread();
                Sandwich.premiumMeat();
                Sandwich.premiumCheese();
                Sandwich.regularToppings();
                Sandwich.sauces();
                Sandwich.sides();
                Sandwich.price();
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
        }
    }
}
