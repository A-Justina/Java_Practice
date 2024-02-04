package day07_custom_class_scanner_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender = input.next();
        System.out.println("Enter your full name");
        input.nextLine();
        String name = input.nextLine();

        System.out.println("Enter your phone number");
        long phone = input.nextLong();
        System.out.println("Enter your zip code");
        int zip = input.nextInt();
        System.out.println("Enter your School name");
        input.nextLine();
        String school = input.nextLine();
        System.out.println("Enter your city name");
        String city = input.nextLine();
        System.out.println("Enter your state name");
        String state = input.next();
        System.out.println("Enter your building number");
        int building = input.nextInt();
        System.out.println("Enter your Street name");
        input.nextLine();
        String street = input.nextLine();
        System.out.println("===============================");

        input.close();


        System.out.println("Full name " +name+"\nAge "+age+"\nGender "+gender+"\nPhone number "+phone+
                "\nAddress:\n\t" +building+ " " +street+ "\n\t" +city+ ", " +state+ " " +zip);

    }
}
/*
Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
 */