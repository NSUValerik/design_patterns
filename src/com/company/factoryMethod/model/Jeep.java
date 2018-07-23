package com.company.factoryMethod.model;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println( "Drive speed 50 km per hour" );
    }

    @Override
    public void stop() {
        System.out.println( "Stop at 10 sec" );
    }
}
