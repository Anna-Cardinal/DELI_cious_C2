package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.Arrays;

import static com.pluralsight.collection.Order.scanner;

public class Chip {
    String[] chips = new String[]{"BBQ", "Sea Salt", "Sour Cream & Onion", "Cheddar"};
    String chip;
    double chipPrice = 1.50;

    public Chip(String chip, double chipPrice){
        this.chip = chip;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public void chips(String chip){
        System.out.println("What chips would you like?");
        System.out.println(Arrays.toString(chips));
        chip = scanner.nextLine();
    }



}
