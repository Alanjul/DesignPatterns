package com.patterns.abstractfactory;

public class MountainFrame implements BikeFrameInterface{
    @Override
    public String getFrameparts() {
        return " frame parts for the mountain bike";
    }
}
