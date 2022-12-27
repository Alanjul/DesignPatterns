package com.patterns.Builder;

import com.patterns.base.BikeInterface;

public class MountainBikeDirector extends AbstractBikeDirector {

    @Override
    public BikeInterface build(AbstractBikeBuilder builder) {
        builder.buildHandlBars();
        builder.buildWideTires();
        return builder.getBike();
    }
}
