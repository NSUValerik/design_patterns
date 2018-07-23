package com.company.abstractFactory;

import com.company.abstractFactory.model.aircrafts.Aircraft;
import com.company.abstractFactory.model.cars.Car;
import com.company.abstractFactory.model.factories.EuropeanFactory;
import com.company.abstractFactory.model.factories.TransportFactory;
import com.company.abstractFactory.model.factories.USAFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TransportFactory> list = new ArrayList<>();

        EuropeanFactory ef = new EuropeanFactory();
        USAFactory uf = new USAFactory();

        list.add(ef);
        list.add(uf);

        TransportFactory tr = list.get(1); // по какому-нибудь условию, можно добавить шаблон singleton в фабрике

        Aircraft aircraft = tr.createAircraft();
        aircraft.flight();

        Car car = tr.createCar();
        car.stop();

/*        Car car_1 = ef.createCar();
        Aircraft aircraft_1 = ef.createAircraft();

        Car car_2 = uf.createCar();
        Aircraft aircraft_2 = uf.createAircraft();

        car_1.drive();
        aircraft_1.flight();
        car_2.drive();
        aircraft_2.flight();*/
    }
    //когда нужно в одном месте создать много объектов
}
