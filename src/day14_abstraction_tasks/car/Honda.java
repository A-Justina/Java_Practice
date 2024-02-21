package day14_abstraction_tasks.car;

import day14_abstraction_tasks.car.Car;

public class Honda extends Car {
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {
        System.out.println(getModel() + " drives.");
    }
}
