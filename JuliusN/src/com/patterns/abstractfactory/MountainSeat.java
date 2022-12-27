package com.patterns.abstractfactory;

public class MountainSeat implements  BikeSeatInterface{
    @Override
    public String getSeatParts() {
        return "Seat parts for the mountain bike ";
    }// end of seatMethod
}// end class
