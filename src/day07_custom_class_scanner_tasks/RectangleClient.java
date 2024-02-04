package day07_custom_class_scanner_tasks;

public class RectangleClient {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 20.5;
        rectangle1.width = 10.5;

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);
        System.out.println("------------------------------");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 55.5;
        rectangle2.width = 15.0;

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        System.out.println(rectangle2);

    }
}
