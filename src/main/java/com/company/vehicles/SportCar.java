package com.company.vehicles;

import com.company.details.Driver;
import com.company.professions.Engine;

public class SportCar extends Car{
    int maxspeed;

    public SportCar(String markAuto, String classAuto, int weight, Driver driver, Engine engine, int maxspeed) {
        super(markAuto, classAuto, weight, driver, engine);
        this.maxspeed = maxspeed;
    }
}
