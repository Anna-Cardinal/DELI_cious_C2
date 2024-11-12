package com.pluralsight.collection;

import java.util.Arrays;
import java.util.Objects;

import static com.pluralsight.collection.Order.scanner;

public class Drink{
    String[] drinks = new String[]{"Coke", "Dr. Pepper", "Banana Milk", "Chocolate Milk", "Lemonade", "Monster Energy"};
    String drink;
    String drinkSize;
    String[] sizes = new String[]{"Small", "Medium", "Large"};
    double drinkPrice = 0;

    public Drink(String drink, double _price){
        this.drink = drink;
        this.drinkPrice = _price;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
    public double get_price() {
        return drinkPrice;
    }

    public void set_price(double _price) {
        this.drinkPrice = _price;
    }

    public void size(String drinkSize){
        System.out.println("What size drink would you like?");
        System.out.println(Arrays.toString(sizes));
        drinkSize = scanner.nextLine();

        if (drinkSize.equals("Small")){
            drinkPrice = 2.00;
        } else if (drinkSize.equals("Medium")) {
            drinkPrice = 2.50;
        } else if (drinkSize.equals("Large")) {
            drinkPrice = 3.00;
        }
    }
}
