package com.patterns.base;

import com.patterns.BikeColor;

public class Touring extends RoadBike{
    public Touring(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }// end constructor
    public Touring(WheelInterface wheel){
        this(wheel, BikeColor.BlUE);
    }// end constructor
}// end class
