package day04_selection_statements_tasks;

public class Finra {
    public static void main(String[] args) {

        int number = 15;

        String result = (number==3)?"FIN":(number==5)?"RA":"FINRA";

        System.out.println(result);
    }
}
/*
Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA
 */