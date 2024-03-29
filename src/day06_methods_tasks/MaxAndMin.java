package day06_methods_tasks;

public class MaxAndMin {
    public static void main(String[] args) {
    max(200, 100);
    max(10.5, 30.2);
    min(200, 100);
    min(10.5, 30.2);
    }

    public static void max (int num1, int num2){
        if (num1>num2) {
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
    public static void max (double num1, double num2){
        if (num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
    public static void min (int num1, int num2){
        if (num1<num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
    public static void min (double num1, double num2){
        if (num1<num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
/*
Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.
	2.2 Create a method named max that returns the maximum number between two double numbers.
	2.3 Create a method named min that returns the minimum number between two integer numbers.
	2.4 Create a method named min that returns the minimum number between two double numbers.

			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100
 */
