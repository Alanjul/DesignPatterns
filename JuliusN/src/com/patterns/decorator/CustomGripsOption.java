package com.patterns.decorator;

import com.patterns.base.BikeInterface;

public class CustomGripsOption  extends AbstractBikeOption{
    public CustomGripsOption(BikeInterface bike){
        super(bike);
    }

    @Override
    public float getPrice() {
        return decoratorBike.getPrice() + 20.00f;
    }
}
