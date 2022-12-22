package com.patterns.base;

import com.patterns.BikeColor;

public abstract class RoadBike extends AbstractBike  {
    protected RoadBike(WheelInterface wheel, BikeColor color){
      super(wheel, color);
    }// end constructor
    protected RoadBike(WheelInterface wheel){
        this(wheel, BikeColor.BLACK);
    } // end constructor

}// End class
