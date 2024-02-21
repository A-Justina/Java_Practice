package day14_abstraction_tasks.car;

public class CarClients {

    public static void main(String[] args) {

        Audi audi = new Audi("Audi", "Q5", 2022, 50000, "Black");
        audi.drive();
        System.out.println(audi);

        Tesla tesla = new Tesla("Tesla", "S", 2020, 49000, "White");
        tesla.selfDrive();
        System.out.println(tesla);

        Toyota toyota = new Toyota("Toyota", "Highlander", 2021, 45000, "Blue");
        System.out.println(toyota);

        CydeoCar cydeoCar = new CydeoCar("CydeoCar", "Java", 1000, 99000, "Silver");
        cydeoCar.fly();
        System.out.println(cydeoCar);

    }
}
