package day14_abstraction_tasks.device;

public class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is off.");
    }
}
/*
Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */