package com.company.abstractFactory.model.cars;

public class Ford implements Car{
    @Override
    public void drive() {
        System.out.println( "Speed is 60 km per hour" );
    }

    @Override
    public void stop() {
        System.out.println( "Stop at 20 sec" );
    }
}
