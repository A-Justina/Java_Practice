package day11_custom_class_tasks;

public class PizzaClient {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("small", 2, 2, 2 );


        Pizza pizza2 = new Pizza("medium", 3, 1,1);


        Pizza pizza3 = new Pizza("Large", 1, 2, 3);

        System.out.println(pizza1);
        System.out.println("Total price: $" + pizza2.calcCost());
        System.out.println(pizza3.quantity + " " + pizza3.size + " pizza will cost you $" + pizza3.calcCost());

    }



}
