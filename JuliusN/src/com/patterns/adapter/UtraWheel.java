package com.patterns.adapter;

public class UtraWheel {
    private int size;
    public UtraWheel( int newSize){
        this.size = newSize;
    }
    public int getWheelSize(){
        return size;
    }

    @Override
    public String toString() {
        return "Ultra wheel " + "(" + size + ") inches";
    }
}
