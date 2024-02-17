package day13_inheritance_tasks.phone;

public class PhoneClients {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone("Iphone", "15 Pro","6.1", 1200, "Black");
        iPhone.faceTime();
        System.out.println(iPhone);


        Samsung samsung = new Samsung("Samsung", "Galaxy", "6.6", 1100, "Grey");
        samsung.call();
        System.out.println(samsung);

        Nokia nokia = new Nokia("Nokia", "NoName", "5", 500, "Blue");
        nokia.text();
        System.out.println(nokia);
    }
}
