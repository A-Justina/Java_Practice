package day12_encapsulation_tasks;

public class RectangleClient {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,10);
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.calcArea());
        System.out.println("Perimeter: " + rectangle1.calcPerimeter());
        System.out.println("=======================================");

        Rectangle rectangle2 = new Rectangle(20,20);
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.calcArea());
        System.out.println("Perimeter: " + rectangle2.calcPerimeter());
    }
}
