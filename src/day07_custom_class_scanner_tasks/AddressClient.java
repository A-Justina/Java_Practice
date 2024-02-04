package day07_custom_class_scanner_tasks;

public class AddressClient {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = 22012;

        address1.address();

        System.out.println(address1);
        System.out.println();

        Address address2 = new Address();
        address2.buildingNumber = 123;
        address2.street = "Nevermind Ln";
        address2.city = "Neverland";
        address2.state = "NL";
        address2.zipCode = 12345;
        address2.address();
        System.out.println(address2);
    }
}
