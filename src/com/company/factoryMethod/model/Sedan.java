package com.company.factoryMethod.model;

public class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println( "Drive speed 100 km per hour" );
    }

    @Override
    public void stop() {
        System.out.println( "Stop at 5 sec" );
    }
}
