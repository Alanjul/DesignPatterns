package com.patterns.Builder;

import com.patterns.base.BikeInterface;

public class RoadBikeDirector extends AbstractBikeDirector {
    @Override
    public BikeInterface build(AbstractBikeBuilder builder) {
        builder.buildHandlBars();
        builder.BuildStreetTires();
        return builder.getBike();
    }
}// end of class
