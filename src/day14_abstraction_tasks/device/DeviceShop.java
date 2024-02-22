package day14_abstraction_tasks.device;

public class DeviceShop {
    public static void main(String[] args) {

        Desktop desktop = new Desktop("HP","ABC", 1200, "grey", "27", false, true);
        desktop.turnOn();
        System.out.println(desktop);

        Google google = new Google("Google", "abc", 900, "black", "12", true, true);
        google.downloadApp();
        System.out.println(google);

        Samsung samsung = new Samsung("Samsung", "Galaxy", 1000, "silver", "15", true, true);
        samsung.downloadApp();
        System.out.println(samsung);


    }
}
