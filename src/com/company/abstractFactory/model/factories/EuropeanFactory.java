package com.company.abstractFactory.model.factories;

import com.company.abstractFactory.model.aircrafts.Aerobus;
import com.company.abstractFactory.model.aircrafts.Aircraft;
import com.company.abstractFactory.model.cars.BMW;
import com.company.abstractFactory.model.cars.Car;

public class EuropeanFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }

    @Override
    public Aircraft createAircraft() {
        return new Aerobus();
    }
}
