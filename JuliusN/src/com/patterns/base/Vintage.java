package com.patterns.base;

import com.patterns.BikeColor;

public class Vintage extends  RoadBike{
    public Vintage(WheelInterface wheel, BikeColor color){

        super(wheel, color);
    } // end constructor
    public Vintage(WheelInterface wheel){
        this(wheel, BikeColor.RED);
    }// end constructor
}// end Class
