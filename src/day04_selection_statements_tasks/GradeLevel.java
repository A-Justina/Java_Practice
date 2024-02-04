package day04_selection_statements_tasks;

public class GradeLevel {
    public static void main(String[] args) {

        byte number = 10;

        if (number >=1 && number <= 5) {
            System.out.println("Elementary school");
        } else if (number >= 6 && number <= 8) {
            System.out.println("Middle School");
        } else if (number >= 9 && number <= 12) {
            System.out.println("High school");
        } else if (number >= 13 && number <=16) {
            System.out.println("College");
        } else if (number >=17 && number <=18) {
            System.out.println("Grad school");
        }else
            System.out.println("Invalid grade level");
        }
    }
/*
Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */

