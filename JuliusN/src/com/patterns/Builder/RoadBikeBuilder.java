package com.patterns.Builder;

import com.patterns.base.BikeInterface;
import com.patterns.base.RoadBike;

public class RoadBikeBuilder extends AbstractBikeBuilder{
   private RoadBike bikeInProgress;
   public RoadBikeBuilder(RoadBike bike){
       this.bikeInProgress = bike;
   }// end of constructor

    @Override
    public void BuildStreetTires() {
        System.out.println("Building street Tires...");
    }// end of method build street tires

    @Override
    public void buildHandlBars() {
        System.out.println("Building handle bars...");
    }

    @Override
    public BikeInterface getBike() {
        return bikeInProgress;
    } // end getBike
}// end class
