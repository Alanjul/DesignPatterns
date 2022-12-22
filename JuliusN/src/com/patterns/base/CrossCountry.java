package com.patterns.base;

import com.patterns.BikeColor;

public class CrossCountry extends MountainBike{
    public CrossCountry(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }// end constructor

    public CrossCountry(WheelInterface wheel){
        this(wheel, BikeColor.ORANGE);
    }// end construtor.
}// end class
