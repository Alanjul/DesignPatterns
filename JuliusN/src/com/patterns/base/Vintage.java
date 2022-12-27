package com.patterns.base;

import com.patterns.BikeColor;

public class Vintage extends  RoadBike{
    public Vintage(WheelInterface wheel, BikeColor color){

        super(wheel, color);
    } // end constructor
    public Vintage(WheelInterface wheel){
        this(wheel, BikeColor.RED);
    }// end constructor

    @Override
    public float getPrice() {
        return 600.00f;
    }
}// end Class
