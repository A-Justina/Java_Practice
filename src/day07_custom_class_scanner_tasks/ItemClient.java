package day07_custom_class_scanner_tasks;

public class ItemClient {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemName = "Apple";
        item1.unitPrice = 1.0;
        item1.quantity = 5;
        item1.calcCost = item1.unitPrice* item1.quantity;

        item1.calcCost();
            System.out.println(item1);
        System.out.println("===========================");

        Item item2 = new Item();
        item2.itemName = "iPhone";
        item2.unitPrice = 1000.0;
        item2.quantity = 2;
        item2.calcCost = item1.unitPrice* item2.quantity;
        item2.calcCost();
        System.out.println(item2);
        }

    }

