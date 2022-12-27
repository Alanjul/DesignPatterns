package com.patterns.base;

import com.patterns.BikeColor;

public abstract class AbstractBike implements BikeInterface{
    private WheelInterface wheel;
    private BikeColor color;
    protected AbstractBike( WheelInterface wheel, BikeColor color){
        this.wheel = wheel;
        this.color = color;
    }
    protected AbstractBike(WheelInterface wheel){
        this(wheel, BikeColor.UNPAINTED);
    }// end constructor

    @Override
    public WheelInterface getWheel() {
        return wheel;
    }// end property get wheell

    @Override
    public BikeColor getColor() {
        return color;
    } // end property getColor

    @Override
    public float getPrice() {
        return 900.00f;
    }

    @Override
    public void paint(BikeColor color) {
        this.color = color;
    }// end method paint

    @Override
    public void airTires() {
        System.out.println("Airing up tires....");
    }

    @Override
    public void  CleanFrame() {
        System.out.println("cleaning frames.....");
    }

    @Override
    public void TestRide() {
        System.out.println("Taking bike out for a test ride");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ( " + wheel + " , " + color +", price = $" +getPrice()+ " ) ";
    }// end toString method
}// end of class
