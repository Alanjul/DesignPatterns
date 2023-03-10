package com.patterns.base;

import com.patterns.BikeColor;

public class CrossCountry extends MountainBike{
    public CrossCountry(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }// end constructor

    public CrossCountry(WheelInterface wheel){
        this(wheel, BikeColor.ORANGE);
    }// end construtor.

    @Override
    public float getPrice() {
        return 850.00f;
    }
}// end class
