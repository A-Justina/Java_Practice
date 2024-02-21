package day14_abstraction_tasks;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " can auto park.");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " started.");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " keeps on driving.");
    }
}
/*
Create two Subclasses of Car ('Audi' and 'Mercedes')
that Implement the AutoPark Interface.
 */