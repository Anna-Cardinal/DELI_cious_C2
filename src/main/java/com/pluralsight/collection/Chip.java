package com.pluralsight.collection;

import java.util.Arrays;

import static com.pluralsight.collection.Order.scanner;

public class Chip {
    static String[] chips = new String[]{"BBQ", "Sea Salt", "Sour Cream & Onion", "Cheddar"};
    static String chip;
    static double chipPrice = 1.50;

    public Chip(String chip, double chipPrice){
        Chip.chip = chip;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        Chip.chip = chip;
    }

    public static void chips(){
        System.out.println("What chips would you like?");
        System.out.println(Arrays.toString(chips));
        chip = scanner.nextLine();
        scanner.nextLine();

        System.out.println(chip +"|$" + chipPrice);
    }

    public static void chipPrice(){
        chipPrice = 1.50;
    }



}
