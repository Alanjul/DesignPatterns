package com.patterns;

import com.patterns.Builder.AbstractBikeBuilder;
import com.patterns.Builder.AbstractBikeDirector;
import com.patterns.Builder.RoadBikeBuilder;
import com.patterns.Builder.RoadBikeDirector;
import com.patterns.Singleton.SerialNumberGenerator;
import com.patterns.abstractfactory.AbstractBikeFactory;
import com.patterns.abstractfactory.BikeFrameInterface;
import com.patterns.abstractfactory.BikeSeatInterface;
import com.patterns.abstractfactory.RoadBikefactory;
import com.patterns.adapter.UltraWheelAdapter;
import com.patterns.adapter.UtraWheel;
import com.patterns.base.*;
import com.patterns.decorator.AbstractBikeOption;
import com.patterns.decorator.GoldFrameOption;
import com.patterns.decorator.LeatherSeatOption;
import com.patterns.facade.Bikefacade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

     //AbstractFactoryExample();
      //  BuilderExample();
        //Singleton();
       // adapterExample();
       // decoratorExample();
        facadeExample();

    }
    static void facadeExample(){
        Bikefacade bikefacade = new Bikefacade();
        bikefacade.prepareForSale(new DownHill(new WideWheel(25)));
    }
    static void decoratorExample(){
        BikeInterface myTouringBike = new Touring (new NarrowWheel(24)) ;
        System.out.println(myTouringBike);
        myTouringBike = new GoldFrameOption(myTouringBike);
        System.out.println(myTouringBike);
        myTouringBike = new LeatherSeatOption(myTouringBike);
        System.out.println(myTouringBike);

    }
    static void adapterExample(){
        UtraWheel ultraWheel = new UtraWheel(28);
        List <WheelInterface> wheels = new ArrayList<WheelInterface>();
        wheels.add( new NarrowWheel(24));
        wheels.add(new NarrowWheel(20));
        wheels.add(new WideWheel(25));
        wheels.add(new UltraWheelAdapter(ultraWheel));
        for (WheelInterface wheel:wheels) {
            System.out.println(wheel);

        }
    }
    static void Singleton(){
        System.out.println(" generating serial numbers ");
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("next serial " + generator.getNextSerial());
        System.out.println("next serial" + generator.getNextSerial());
        System.out.println("next serial" + generator.getNextSerial() );
    }
    static void BuilderExample(){
        RoadBike bike = new Touring(new NarrowWheel(22));
        AbstractBikeBuilder builder = new RoadBikeBuilder(bike);
        AbstractBikeDirector director = new RoadBikeDirector();
        BikeInterface bikeInterface = director.build(builder);
        System.out.println(bikeInterface);
    }
    static void AbstractFactoryExample(){
        AbstractBikeFactory factory = new RoadBikefactory();
        BikeFrameInterface frame = factory.creatFrame();
        BikeSeatInterface seat = factory.createSeat();
        System.out.println(frame.getFrameparts());
        System.out.println(seat.getSeatParts());
    }
}