package day08_string_tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Split or No Split (Yes or No)? ");
        String split = input.nextLine();

        System.out.println("Enter the number of people: ");
        int people = input.nextInt();

        System.out.println("Enter the check amount: ");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = input.next();
        input.close();

        double totalTip = 0;
        if (quality.equals("poor")){
            totalTip = amount*0.05;
        } else if (quality.equals("fair")){
            totalTip = amount*0.10;
        } else if (quality.equals("good")) {
            totalTip = amount*0.15;
        } else if (quality.equals("great")) {
            totalTip = amount*0.20;
        } else if (quality.equals("excellent")) {
            totalTip = amount*0.25;
        }

        double totalToPay = amount+totalTip;
        double totalPerPerson = totalToPay/people;

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: $" + totalToPay);
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total per person: $" + totalPerPerson);
        System.out.println("Tip per person: $" + totalTip/people);

    }
}
/*
Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */