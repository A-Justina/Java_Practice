package day04_selection_statements_tasks;

public class MonthName {
    public static void main(String[] args) {

        int number = 1;

        switch (number) {
            case (1) -> System.out.println("Jan");
            case (2) -> System.out.println("Feb");
            case (3) -> System.out.println("Mar");
            case (4) -> System.out.println("Apr");
            case (5) -> System.out.println("May");
            case (6) -> System.out.println("Jun");
            case (7) -> System.out.println("Jul");
            case (8) -> System.out.println("Aug");
            case (9) -> System.out.println("Sep");
            case (10) -> System.out.println("Oct");
            case (11) -> System.out.println("Nov");
            case (12) -> System.out.println("Dec");
            default -> System.out.println("No such month");
        }
    }
}
/*
Create a class named MonthName. Given an integer variable named number representing the number
of the month, write a program that displays the month's name based on the given number.

			Example 1:
				     number = 10

			Output:
				  October

			Example 2:
				     number = -20

			Output:
				  No such month
 */