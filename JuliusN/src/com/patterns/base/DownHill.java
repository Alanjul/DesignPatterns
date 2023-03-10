package com.patterns.base;

import com.patterns.BikeColor;

public class DownHill extends MountainBike{
    public DownHill(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }// end construtor
    public DownHill(WheelInterface wheel){
        this(wheel, BikeColor.GREEN);
    }// end constructor

    @Override
    public float getPrice() {
        return 870.00f;
    }
}// end class
