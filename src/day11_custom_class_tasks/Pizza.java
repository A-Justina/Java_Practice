package day11_custom_class_tasks;

public class Pizza {

    public String size;
    public int quantity;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public Pizza(String size, int quantity, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.quantity = quantity;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", quantity=" + quantity +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public double calcCost() {
        double totalCost = 0;

        double basePrice = (size.equalsIgnoreCase("small") ? 10 : size.equalsIgnoreCase("medium") ? 12 : 14);

        double toppingsPrice = (numberOfCheeseTopping * 2) + (numberOfPepperoniTopping * 2);

        totalCost = (basePrice + toppingsPrice) * quantity;

        return totalCost;

    }
}
