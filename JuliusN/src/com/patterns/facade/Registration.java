package com.patterns.facade;

import com.patterns.Singleton.SerialNumberGenerator;
import com.patterns.base.BikeInterface;

public class Registration {
    private BikeInterface bike;
    public Registration(BikeInterface bike){
        this.bike = bike;
    }
    public void AllocatingBikeNumber(){
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("allocting bike number " + generator.getNextSerial());
    }
}
