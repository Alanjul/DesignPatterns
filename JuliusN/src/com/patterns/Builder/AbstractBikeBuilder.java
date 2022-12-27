package com.patterns.Builder;

import com.patterns.base.BikeInterface;

public abstract class AbstractBikeBuilder {
    public abstract BikeInterface getBike();
    public void BuildStreetTires(){ }
    public void buildWideTires(){}
    public void buildHandlBars(){}
}
