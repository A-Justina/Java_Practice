package day11_custom_class_tasks;

public class Carpet {

    public double   width,
                    length,
                    unitPrice;
    public boolean isPersian;
    public double calcPrice() {
        return (width * length * unitPrice) + (isPersian ? 200 : 0);
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
