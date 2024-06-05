package org.example;

public class Jurnal extends Magazine{

    public Jurnal(String name) {
        super(name);
    }


    public void print() {
        System.out.println("Это журнал "+ getName());
    }
}
