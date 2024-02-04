package day08_string_tasks;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String info = input.next();
        input.close();

        String firstName = info.substring(0, info.indexOf("_"));
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

        String lastName = info.substring(info.indexOf("_") + 1, info.indexOf("@"));
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        String domain = info.substring(info.indexOf("@") + 1, info.indexOf("."));

        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);
    }
}
/*
Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */