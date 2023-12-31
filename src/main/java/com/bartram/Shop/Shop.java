package com.bartram.Shop;

import com.bartram.Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        stock.remove(item);
    }

    //PDA example of algorithm
    public double calculateTotalValueOfStock() {
        double totalValue = 0.0;
        for (ISell item : stock) {
            totalValue += item.getSalesPrice();
        }
        return totalValue;
    }
}
