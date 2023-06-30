package com.bartram.Instruments;

import com.bartram.Behaviours.ISell;
import com.bartram.Shop.Item;

public class Piano extends Instrument implements ISell {

    private int numberOfKeys;
    Item item;

    public Piano(String material, String colour, int numberOfKeys, Item item) {
        super(material, colour, "Keyboard", item.getCostPrice(), item.getSalesPrice());
        this.numberOfKeys = numberOfKeys;
        this.item = item;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    @Override
    public String play() {
        return "Sing us a song you're the piano man";
    }

    @Override
    public double calculateMarkup() {
        return item.getSalesPrice() - item.getCostPrice();
    }
}
