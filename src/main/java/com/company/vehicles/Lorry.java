package com.company.vehicles;

import com.company.details.Driver;
import com.company.professions.Engine;

public class Lorry extends Car{
    int loadCapacity;

    public Lorry(String markAuto, String classAuto, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(markAuto, classAuto, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }
}
