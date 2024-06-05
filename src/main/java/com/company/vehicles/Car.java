package com.company.vehicles;
/* Класс Car содержит поля - марка автомобиля, класс автомобиля,
вес, водитель типа Driver, мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(),
 которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А
  также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 */

import com.company.details.Driver;
import com.company.professions.Engine;

public class Car {
    String markAuto;
    String classAuto;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String markAuto, String classAuto, int weight, Driver driver, Engine engine) {
        this.markAuto = markAuto;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "markAuto='" + markAuto + '\'' +
                ", classAuto='" + classAuto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}