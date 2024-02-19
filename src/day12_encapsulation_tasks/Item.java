package day12_encapsulation_tasks;

public class Item {

    private String name;
    private int unitPrice;
    private int quantity;

    public Item(String name, int unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("The name cannot be empty or blank.");
            System.exit(1);
        }
        /*boolean isSpecialChar;
        System.err.println("The name cannot contain any special characters other than space.");
        this.name = this.name;*/
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice < 0){
            System.err.println("The unit price cannot be negative.");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {

        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.err.println("The quantity cannot be negative.");
            System.exit(1);
        }
        this.quantity = quantity;
    }
    public double calcCost(){
        return unitPrice*quantity;

    }
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost()+
                '}';
    }
}
/*
Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */