package day13_inheritance_tasks.phone;

public class IPhone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public IPhone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty()|| brand.isBlank()||brand==null) {
            System.err.println("Brand can not be null, empty, or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(brand.isEmpty()|| brand.isBlank()||brand==null){
            System.err.println("Model can not be null, empty, or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0) {
            System.err.println("The price must be greater than zero");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(brand.isEmpty()|| brand.isBlank()||brand==null) {
            System.err.println("Color can not be null, empty, or blank");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(){
        System.out.println("Calling the phone number...");
    }
    public void text(){
        System.out.println("Texting to the number...");
    }
    public void faceTime(){
        System.out.println("Face timing with the number...");
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
