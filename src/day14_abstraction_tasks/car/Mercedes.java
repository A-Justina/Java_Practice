package day14_abstraction_tasks.car;

import day14_abstraction_tasks.car.AutoPark;
import day14_abstraction_tasks.car.Car;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
