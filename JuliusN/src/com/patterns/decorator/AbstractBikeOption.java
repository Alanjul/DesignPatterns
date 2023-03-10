package com.patterns.decorator;

import com.patterns.base.AbstractBike;
import com.patterns.base.BikeInterface;

public abstract class AbstractBikeOption extends AbstractBike {
    protected BikeInterface decoratorBike;
    public AbstractBikeOption(BikeInterface bike){
        super(bike.getWheel());
        this.decoratorBike = bike;
    }

}
