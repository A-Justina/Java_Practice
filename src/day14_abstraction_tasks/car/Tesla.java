package day14_abstraction_tasks.car;

import day14_abstraction_tasks.car.AutoPilot;
import day14_abstraction_tasks.car.Car;

public class Tesla extends Car implements AutoPilot {


    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " drives itself.");
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
/*
Create two Subclasses of Car ('Tesla' and 'Nio') that
Implement both AutoPark and AutoPilot Interfaces.
 */