package com.patterns.adapter;

import com.patterns.base.AbstractWheel;

public class UltraWheelAdapter extends AbstractWheel {
    public UltraWheelAdapter(UtraWheel ultraWheel ) {
        super(ultraWheel.getWheelSize(), false);
    }
}
