package day14_abstraction_tasks.device;

public class Phone extends Device{
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is off.");
    }
    public void call(){
        System.out.println(getBrand() + " " + getModel() + " can call.");
    }
    public void text(){
        System.out.println(getBrand() + " " + getModel() + " can text.");
    }

}
/*
Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */