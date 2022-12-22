package com.patterns.base;

public abstract class AbstractWheel implements WheelInterface {
    private int size;
    private boolean wide;

    public AbstractWheel(int newSize, boolean isWide){
       this.size = newSize;
       this.wide = isWide;
    }// end constructor

    @Override
    public int getSize() {
        return size;
    }// end property getSize

    @Override
    public boolean isWide() {
        return wide;
    }// end property is wide

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + size + " inches";
    }
} // end of the class
