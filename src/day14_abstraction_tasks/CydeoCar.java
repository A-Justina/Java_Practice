package day14_abstraction_tasks;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
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

    @Override
    public void fly() {
        System.out.println(getMake() + " can fly!");
    }
}
