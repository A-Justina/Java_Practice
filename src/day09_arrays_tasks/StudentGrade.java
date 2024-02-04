package day09_arrays_tasks;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {

        String[] studentNames = {"Anna", "Nancy", "Sarah"};
        int[] score = {90, 75, 80};
        char[] grades = {'A', 'B', 'C'};

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 90) {
                grades[i] = 'A';
            } else if (score[i] >= 80) {
                grades[i] = 'B';
            } else if (score[i] >= 70) {
                grades[i] = 'C';
            } else if (score[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        System.out.println("Grades = " + Arrays.toString(grades));

        for (int i = 0; i < studentNames.length; i++) {

            System.out.println(studentNames[i] + "'s score is " + score[i]+ ", and grade is " + grades[i]);
        }
    }
}
/*
4. Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */