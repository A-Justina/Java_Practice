package day12_encapsulation_tasks;

public class CircleClients {
    public static void main(String[] args) {

        Circle circle1 = new Circle(10);

        System.out.println(circle1);
        System.out.println("Radius " + circle1.getRadius());
        System.out.println("Area " + circle1.calcArea());
        System.out.println("Perimeter " + circle1.calcPerimeter());
        System.out.println("===================================");

        Circle circle2 = new Circle(0);
        System.out.println(circle2);
        System.out.println("Area " + circle2.calcArea());
        System.out.println("Perimeter " + circle2.calcPerimeter());

    }
}
