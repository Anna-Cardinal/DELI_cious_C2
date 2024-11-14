package com.pluralsight.collection;

import java.util.Arrays;

public class Sandwich implements Order{

    static int sandwichSize;
    static String breadType;
    static String meat;
    static String cheese;
    static String[] regularTopping;
    static String sauce;
    static String side;
    static String extraMeat;
    static String extraCheese;
    static double _price = 0;
    static double tPrice = 0;
    static double mPrice;
    static double cPrice;
    static double emPrice;
    static double ecPrice;

    static String[] regularToppings = new String[]{"lettuce", "peppers", "onions", "tomatoes", "jalapenos", "cucumbers", "pickles", "guacamole", "mushrooms"};
    String lettuce = regularToppings[0];
    String peppers = regularToppings[1];
    String onions = regularToppings[2];
    String tomatoes = regularToppings[3];
    String jalapenos = regularToppings[4];
    String cucumbers = regularToppings[5];
    String pickles = regularToppings[6];
    String guacamole = regularToppings[7];
    String mushrooms = regularToppings[8];
    static String[] breads = new String[]{"White", "Wheat", "Rye", "Wrap", "Pumpernickel"};
    static String[] meatTopping = new String[]{"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
    static String[] cheeseTopping = new String[]{"American", "Provolone", "Cheddar", "Swiss"};
    static String[] sauces = new String[]{"mayo", "mustard", "ketchup", "ranch", "thousand islands", "vinaigrette"};
    static String[] sides = new  String[]{"Au Jus", "Sauce", "Potato Salad"};

    public Sandwich(int sandwichSize, String breadType, String meat, String cheese, String[] regularTopping, String sauce, String side) {
        Sandwich.sandwichSize = sandwichSize;
        Sandwich.breadType = breadType;
        Sandwich.meat = meat;
        Sandwich.cheese = cheese;
        Sandwich.regularTopping = regularTopping;
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

    public String[] getRegularTopping() {
        return regularTopping;
    }

    public void setRegularTopping(String regularTopping) {
        Sandwich.regularTopping = new String[]{regularTopping};
    }

    public String getExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(String extraMeat) {
        Sandwich.extraMeat = extraMeat;
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

    public static void buildSandwich() {
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

        System.out.println("What bread would you like?");
        System.out.println(Arrays.toString(breads));
        breadType = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Would you like to add meat to your sandwich?");
        String yesNo = scanner.nextLine();
        if (yesNo.equalsIgnoreCase("Yes")) {
            if (sandwichSize == 4) {
                mPrice = 1.00;
            } else if (sandwichSize == 8) {
                mPrice = 2.00;
            } else if (sandwichSize == 12) {
                mPrice = 3.00;
            }
        }else mPrice = 0;
        System.out.println("What meat would you like?");
        System.out.println(Arrays.toString(meatTopping));
        meat = scanner.nextLine();


        System.out.println("Would you like extra meat?");
        extraMeat = scanner.nextLine();
        if (extraMeat.equals("Yes")){
            if (sandwichSize == 4){
                emPrice = 0.50;
            } else if (sandwichSize == 8) {
                emPrice = 1.00;
            } else if (sandwichSize == 12) {
                emPrice = 1.50;
            }
        }else emPrice = 0;

        System.out.println("Would you like to add Cheese to your sandwich?");
        yesNo = scanner.nextLine();
        if (yesNo.equalsIgnoreCase("yes")) {
            if (sandwichSize == 4) {
                cPrice = 0.75;
            } else if (sandwichSize == 8) {
                cPrice = 1.50;
            } else if (sandwichSize == 12) {
                cPrice = 2.25;
            }
        }else cPrice = 0;
        System.out.println("What cheese would you like?");
        System.out.println(Arrays.toString(cheeseTopping));
        cheese = scanner.nextLine();


        System.out.println("Would you like extra cheese?");
        extraCheese = scanner.nextLine();
        if (extraCheese.equals("Yes")){
            if (sandwichSize == 4){
                ecPrice = 0.30;
            } else if (sandwichSize == 8) {
                ecPrice = 0.60;
            } else if (sandwichSize == 12) {
                ecPrice = 0.90;
            }
        }else ecPrice = 0;


        System.out.println("What toppings would you like?");
        System.out.println(Arrays.toString(regularToppings));
        regularTopping = new String[]{scanner.nextLine()};


        System.out.println("What sauce would you like?");
        System.out.println(Arrays.toString(sauces));
        sauce = scanner.nextLine();

        System.out.println("What sides would you like?");
        System.out.println(Arrays.toString(sides));
        side = scanner.nextLine();

        tPrice = _price + mPrice + cPrice + emPrice + ecPrice;
        System.out.println("$" + tPrice);
    }

        //Display the calculation that makes up the total price




}
