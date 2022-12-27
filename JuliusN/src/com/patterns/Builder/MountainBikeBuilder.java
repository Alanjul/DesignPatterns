package com.patterns.Builder;

import com.patterns.base.BikeInterface;
import com.patterns.base.MountainBike;

public class MountainBikeBuilder extends AbstractBikeBuilder{
    private MountainBike bikeInProgress;
    public MountainBikeBuilder(MountainBike bike){
        this.bikeInProgress = bike;
    }// end constructor
    @Override
    public BikeInterface getBike() {
        return bikeInProgress;
    }// end method get bike

    @Override
    public void buildWideTires() {
        System.out.println("Building wider tires...");
    }// end method build wide tires

    @Override
    public void buildHandlBars() {
        System.out.println("Build handle bars....");
    }// end of method handle bars
}// end class
