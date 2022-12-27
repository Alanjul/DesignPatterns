package com.patterns.Builder;

import com.patterns.base.BikeInterface;

public abstract class AbstractBikeDirector {
    public abstract BikeInterface build(AbstractBikeBuilder builder);
}
