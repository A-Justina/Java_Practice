package day14_abstraction_tasks.car;

import day14_abstraction_tasks.car.Car;

public class Toyota extends Car {
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " just started.");
    }

    @Override
    public void drive() {

    }
}
