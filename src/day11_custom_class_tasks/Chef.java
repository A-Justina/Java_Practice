package day11_custom_class_tasks;

public class Chef {
    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;

    public void makeOrder(){
        System.out.println(name + " is making an order");
    }
    public void washDishes(){
        System.out.println(name + " is washing dishes");
    }

    public Chef(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
