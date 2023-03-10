package com.patterns.decorator;

import com.patterns.base.BikeInterface;

public class WhiteTireOption extends AbstractBikeOption{
    public WhiteTireOption(BikeInterface bike){
        super(bike);
    }

    @Override
    public float getPrice() {
        return decoratorBike.getPrice() + 80.00f;
    }
}
