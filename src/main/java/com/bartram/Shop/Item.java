package com.bartram.Shop;

import com.bartram.Behaviours.ISell;

public class Item implements ISell {

    private String description;
    private double costPrice;
    private double salesPrice;

    public Item(String description, double costPrice, double salesPrice) {
        this.description = description;
        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    @Override
    public double calculateMarkup() {
        return getSalesPrice() - getCostPrice();
    }
}
