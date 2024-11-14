package com.pluralsight.collection;

import java.util.Arrays;

import static com.pluralsight.collection.Order.scanner;

public class Drink{
    static String[] drinks = new String[]{"Coke", "Dr. Pepper", "Banana Milk", "Chocolate Milk", "Lemonade", "Monster Energy"};
    static String drink;
    static String drinkSize;
    static String[] sizes = new String[]{"Small", "Medium", "Large"};
    static double drinkPrice = 0;

    public Drink(String drink, double _price){
        Drink.drink = drink;
        drinkPrice = _price;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        Drink.drink = drink;
    }
    public double get_price() {
        return drinkPrice;
    }

    public void set_price(double _price) {
        drinkPrice = _price;
    }

    public static void size(){
        System.out.println("What flavor would you like?");
        System.out.println(Arrays.toString(drinks));
        drink = scanner.nextLine();
        scanner.nextLine();
        System.out.println("What size drink would you like?");
        System.out.println(Arrays.toString(sizes));
        drinkSize = scanner.nextLine();





    }

    public static void drinkPrice(){
        if (drinkSize.equals("Small")){
            drinkPrice = 2.00;
        } else if (drinkSize.equals("Medium")) {
            drinkPrice = 2.50;
        } else if (drinkSize.equals("Large")) {
            drinkPrice = 3.00;
        }
    }

    public static void totalDrink(){
        System.out.println(drinkSize + "|" + drink + "|$" + drinkPrice);

    }
}
