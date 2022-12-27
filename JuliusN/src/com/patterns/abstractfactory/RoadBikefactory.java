package com.patterns.abstractfactory;

public class RoadBikefactory extends AbstractBikeFactory{
    @Override
   public BikeFrameInterface creatFrame() {
        return new RoadFrame();
    } // end abstract frame

    @Override
   public BikeSeatInterface createSeat() {
        return new RoadSeat();
    } // end abstract create seat
}// end class
