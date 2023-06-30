package com.bartram.Instruments;

import com.bartram.Behaviours.ISell;
import com.bartram.Shop.Item;

public class Guitar extends Instrument implements ISell {

    private int numberOfStrings;
    private Item item;

    public Guitar(String material, String colour, int numberOfStrings, Item item) {
        super(material, colour, "String", item.getCostPrice(), item.getSalesPrice());
        this.numberOfStrings = numberOfStrings;
        this.item = item;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "Strumming my pain with his fingers";
    }

    @Override
    public double calculateMarkup() {
        return item.getSalesPrice() - item.getCostPrice();
    }
}
