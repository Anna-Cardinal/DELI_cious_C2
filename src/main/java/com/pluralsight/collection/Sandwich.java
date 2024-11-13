package com.pluralsight.collection;

import java.util.Arrays;

public class Sandwich implements Order{

    static int sandwichSize;
    static String breadType;
    static String meat;
    static String cheese;
    static String regularTopping;
    static String sauce;
    static String side;
    boolean extraTopping;
    static double _price = 0;
    static double tPrice = 0;
    static double mPrice;
    static double cPrice;

    static String[] regularToppings = new String[]{"lettuce", "peppers", "onions", "tomatoes", "jalapenos", "cucumbers", "pickles", "guacamole", "mushrooms"};
    static String[] breads = new String[]{"White", "Wheat", "Rye", "Wrap", "Pumpernickel"};
    static String[] meatTopping = new String[]{"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
    static String[] cheeseTopping = new String[]{"American", "Provolone", "Cheddar", "Swiss"};
    static String[] sauces = new String[]{"mayo", "mustard", "ketchup", "ranch", "thousand islands", "vinaigrette"};
    static String[] sides = new  String[]{"Au Jus", "Sauce", "Potato Salad"};

    public Sandwich(int sandwichSize, String breadType, String meat, String cheese, String regularTopping, boolean extraTopping, String sauce, String side) {
        Sandwich.sandwichSize = sandwichSize;
        Sandwich.breadType = breadType;
        Sandwich.meat = meat;
        Sandwich.cheese = cheese;
        Sandwich.regularTopping = regularTopping;
        this.extraTopping = extraTopping;
        Sandwich.sauce = sauce;
        Sandwich.side = side;
    }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        Sandwich.sandwichSize = sandwichSize;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        Sandwich.breadType = breadType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        Sandwich.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        Sandwich.cheese = cheese;
    }

    public String getRegularTopping() {
        return regularTopping;
    }

    public void setRegularTopping(String regularTopping) {
        Sandwich.regularTopping = regularTopping;
    }

    public boolean getExtraTopping() {
        return extraTopping;
    }

    public void setExtraTopping(boolean extraTopping) {
        this.extraTopping = extraTopping;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        Sandwich.sauce = sauce;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        Sandwich.side = side;
    }

    public static void size(){
        System.out.println("What size sandwich would you like?");
        System.out.println("4 inch, 8 inch, 12 inch");
        sandwichSize = scanner.nextInt();
        if (sandwichSize == 4){
            _price = 5.50;
        } else if (sandwichSize == 8) {
            _price = 7.00;
        } else if (sandwichSize == 12) {
            _price = 8.50;
        }
    }

    public static void bread(){
        System.out.println("What bread would you like?");
        System.out.println(Arrays.toString(breads));
        breadType = scanner.nextLine();
        scanner.nextLine();
    }

    public static void premiumMeat(){
        System.out.println("What meat would you like?");
        System.out.println(Arrays.toString(meatTopping));
        meat = scanner.nextLine();
        if (sandwichSize == 4){
             mPrice = 1.00;
        } else if (sandwichSize == 8) {
             mPrice = 2.00;
        } else if (sandwichSize == 12) {
             mPrice = 3.00;
        }
    }

    public static void premiumCheese(){
        System.out.println("What cheese would you like?");
        System.out.println(Arrays.toString(cheeseTopping));
        cheese = scanner.nextLine();
        if (sandwichSize == 4){
             cPrice = 0.75;
        } else if (sandwichSize == 8) {
             cPrice = 1.50;
        } else if (sandwichSize == 12) {
             cPrice = 2.25;
        }
    }

    public static void regularToppings(){
        System.out.println("What toppings would you like?");
        System.out.println(Arrays.toString(regularToppings));
        regularTopping = scanner.nextLine();
    }

    public static void sauces(){
        System.out.println("What sauce would you like?");
        System.out.println(Arrays.toString(sauces));
        sauce = scanner.nextLine();
    }

    public static void sides(){
        System.out.println("What sides would you like?");
        System.out.println(Arrays.toString(sides));
        side = scanner.nextLine();
    }

    public static void price(){
        tPrice = _price + mPrice + cPrice;
        System.out.println("$" + tPrice);
    }



}
