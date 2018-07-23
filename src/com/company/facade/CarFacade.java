package com.company.facade;

import com.company.facade.model.Door;
import com.company.facade.model.StartStopButton;
import com.company.facade.model.Wheel;

public class CarFacade {
    private Door door = new Door();
    private Wheel wheel = new Wheel();
    private StartStopButton button = new StartStopButton();

    public void go()
    {
        door.open();
        button.pushButton();
        wheel.turn();
    }
}
