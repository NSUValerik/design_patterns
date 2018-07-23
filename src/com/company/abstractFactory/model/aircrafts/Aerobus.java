package com.company.abstractFactory.model.aircrafts;

public class Aerobus implements Aircraft {
    @Override
    public void flight() {
        System.out.println("A320");
    }
}
