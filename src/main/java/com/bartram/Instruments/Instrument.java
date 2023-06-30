package com.bartram.Instruments;

import com.bartram.Behaviours.IPlay;
import com.bartram.Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String material;
    private String colour;
    private String type;
    private double costPrice;
    private double salesPrice;

    public Instrument(String material, String colour, String type, double costPrice, double salesPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    @Override
    public double calculateMarkup() {
        return salesPrice - costPrice;
    }

}
