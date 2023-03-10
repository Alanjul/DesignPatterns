package com.patterns.Singleton;

public class SerialNumberGenerator {
    private static SerialNumberGenerator instance;
    private int count = 654321;
   /* public synchraonized*/ public static  SerialNumberGenerator getInstance(){
        if(instance == null){
            instance = new SerialNumberGenerator();

        }
        return instance;
    }
    private SerialNumberGenerator(){}
    public synchronized  int getNextSerial (){
        return ++count;
    }
}
