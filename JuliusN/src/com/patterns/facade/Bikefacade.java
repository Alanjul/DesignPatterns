package com.patterns.facade;

import com.patterns.base.BikeInterface;

public class Bikefacade {
    public void prepareForSale(BikeInterface bike){
        Registration registar = new Registration(bike);
        registar.AllocatingBikeNumber();
        Documentation.printBrochure(bike);
        bike.CleanFrame();
        bike.airTires();
        bike.TestRide();
    }
}
