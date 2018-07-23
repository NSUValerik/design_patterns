package com.company.abstractFactory.model.factories;

import com.company.abstractFactory.model.aircrafts.Aircraft;
import com.company.abstractFactory.model.cars.Car;

public interface TransportFactory {
    Car createCar();

    Aircraft createAircraft();
}
