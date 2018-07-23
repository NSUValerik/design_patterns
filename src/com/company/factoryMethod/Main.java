package com.company.factoryMethod;

import com.company.factoryMethod.model.Car;
import com.company.factoryMethod.model.Crossover;
import com.company.factoryMethod.model.Jeep;
import com.company.factoryMethod.model.Sedan;

public class Main {
    public static void main(String[] args) {
        Car jeep = new Jeep();
        jeep.drive();

        Car sedan = new Sedan();
        sedan.drive();
//factory method
        Car carCity = CarSelector.getCar( RoadType.CITY );
        Car carCountry = CarSelector.getCar( RoadType.COUNTRY );
        Car carOffroad = CarSelector.getCar( RoadType.OFFROAD );

        carCity.drive();
        carCountry.drive();
        carOffroad.drive();
    }
}

class CarSelector {
    static Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Sedan();
                break;
            case COUNTRY:
                car = new Crossover();
                break;
            case OFFROAD:
                car = new Jeep();
                break;
        }
        return car;
    }
}