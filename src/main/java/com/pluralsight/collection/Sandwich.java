package com.pluralsight.collection;

import java.util.Arrays;

public class Sandwich implements Order{

    int sandwichSize;
    String breadType;
    String meat;
    String cheese;
    String regularTopping;
    boolean extraTopping;
    double _price = 0;

    String[] breads = new String[]{"White", "Wheat", "Rye", "Wrap", "Pumpernickel"};
    String[] meatTopping = new String[]{"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
    String[] cheeseTopping = new String[]{"American", "Provolone", "Cheddar", "Swiss"};

    public Sandwich(int sandwichSize, String breadType, String meat, String cheese, String regularTopping, boolean extraTopping) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.meat = meat;
        this.cheese = cheese;
        this.regularTopping = regularTopping;
        this.extraTopping = extraTopping;
    }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getRegularTopping() {
        return regularTopping;
    }

    public void setRegularTopping(String regularTopping) {
        this.regularTopping = regularTopping;
    }

    public boolean getExtraTopping() {
        return extraTopping;
    }

    public void setExtraTopping(boolean extraTopping) {
        this.extraTopping = extraTopping;
    }

    public void size(int sandwichSize){
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

    public void bread(String breadType){
        System.out.println("What bread would you like?");
        System.out.println(Arrays.toString(breads));
        breadType = scanner.nextLine();
    }

    public void premiumMeat(String meat){
        System.out.println("What meat would you like?");
        System.out.println(Arrays.toString(meatTopping));
        meat = scanner.nextLine();
        if (sandwichSize == 4){
            double tPrice = _price + 1.00;
        } else if (sandwichSize == 8) {
            double tPrice = _price + 2.00;
        } else if (sandwichSize == 12) {
            double tPrice = _price + 3.00;
        }
    }

    public void premiumCheese(String cheese){
        System.out.println("What cheese would you like?");
        System.out.println(Arrays.toString(cheeseTopping));
        cheese = scanner.nextLine();
        if (sandwichSize == 4){
            double tPrice = _price + 0.75;
        } else if (sandwichSize == 8) {
            double tPrice = _price + 1.50;
        } else if (sandwichSize == 12) {
            double tPrice = _price + 2.25;
        }
    }



}
