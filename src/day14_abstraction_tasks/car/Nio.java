package day14_abstraction_tasks.car;

import day14_abstraction_tasks.car.AutoPark;
import day14_abstraction_tasks.car.AutoPilot;
import day14_abstraction_tasks.car.Car;

public class Nio extends Car implements AutoPark, AutoPilot {
    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
