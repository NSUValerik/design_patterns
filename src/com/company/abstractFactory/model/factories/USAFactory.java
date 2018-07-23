package com.company.abstractFactory.model.factories;

import com.company.abstractFactory.model.aircrafts.Aircraft;
import com.company.abstractFactory.model.aircrafts.Boeing;
import com.company.abstractFactory.model.cars.Car;
import com.company.abstractFactory.model.cars.Ford;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing();
    }
}
