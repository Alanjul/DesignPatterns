package com.patterns.base;

import com.patterns.BikeColor;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();
    float getPrice();
    void paint(BikeColor color);
    void CleanFrame();
    void airTires();
    void TestRide();
}
