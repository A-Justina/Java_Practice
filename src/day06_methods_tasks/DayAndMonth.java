package day06_methods_tasks;

public class DayAndMonth {
    public static void main(String[] args) {
    day(1);
    monthName(6);
    daysInMonth(1);

    }
    public static void day (int dayNumber){
       switch (dayNumber){
           case (1)-> System.out.println("Monday");
           case (2)-> System.out.println("Tuesday");
           case (3)-> System.out.println("Wednesday");
           case (4)-> System.out.println("Thursday");
           case (5)-> System.out.println("Friday");
           case (6)-> System.out.println("Saturday");
           case (7)-> System.out.println("Sunday");
           default -> System.out.println("Invalid");
       }
    }
    public static void monthName (int monthNumber) {
        switch (monthNumber) {
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
    public static void daysInMonth (int days){
        switch (days) {
            case (1) -> System.out.println("Jan has 31 days");
            case (2) -> System.out.println("Feb has 28 days");
            case (3) -> System.out.println("Mar has 31 days");
            case (4) -> System.out.println("Apr has 30 days");
            case (5) -> System.out.println("May has 31 days");
            case (6) -> System.out.println("June has 30 days");
            case (7) -> System.out.println("July has 31 days");
            case (8) -> System.out.println("Aug has 31 days");
            case (9) -> System.out.println("Sep has 30 days");
            case (10) -> System.out.println("Oct has 31 days");
            case (11) -> System.out.println("Nov has 30 days");
            case (12) -> System.out.println("Dec has 31 days");
            default -> System.out.println("Invalid");
        }
    }
}
/*
Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".
			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."
			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."
				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */