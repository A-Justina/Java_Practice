package day11_custom_class_tasks;

public class CarpetClient {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(5,10, 10, true);

        Carpet carpet2 = new Carpet(7, 8, 25, false);

        System.out.println(carpet1);
        System.out.println("Carper costs: $" + carpet1.calcPrice());

        System.out.println(carpet2);
        System.out.println("Carper costs: $" + carpet2.calcPrice());

    }
}
