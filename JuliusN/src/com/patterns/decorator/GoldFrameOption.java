package com.patterns.decorator;

import com.patterns.base.BikeInterface;

public class GoldFrameOption extends AbstractBikeOption{
    public GoldFrameOption(BikeInterface bike){
        super(bike);
    }

    @Override
    public float getPrice() {
        return decoratorBike.getPrice() + 300.00f;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + getWheel() + ", GOLD FRAME PRICE = $ " + getPrice() +")";
    }
}
