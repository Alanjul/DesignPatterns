package com.patterns.abstractfactory;

public class MountainBikeFactory extends AbstractBikeFactory{
    @Override
  public   BikeFrameInterface creatFrame() {
        return new MountainFrame();
    }

    @Override
  public  BikeSeatInterface createSeat() {
        return new MountainSeat() ;
    }// end abstract create method
}// end class
