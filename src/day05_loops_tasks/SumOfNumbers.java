package day05_loops_tasks;

public class SumOfNumbers {
    public static void main(String[] args) {

    /*
    int number = 50;
    int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println(sum);
            }                           */

        int num1 = 1;
        int num2 = 100;
        int sum = 0;

        while (num1<=num2){
            sum += num1;
            num1++;
            System.out.println(sum);
        }
        }
    }
/*
Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100
				Output:
					  5050

				Example 2:
					    number = 50
				Output:
					  1275
 */
