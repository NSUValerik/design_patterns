package com.company.abstractFactory.model.cars;

public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println( "Speed is 120 km per hour" );
    }

    @Override
    public void stop() {
        System.out.println( "Stop at 10 sec" );
    }
}
