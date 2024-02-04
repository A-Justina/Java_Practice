package day06_methods_tasks;

public class OddAndEven {

    public static void main(String[] args) {

        isOdd(100);
        isEven(100);
    }
    public static void isOdd(int x) {

        if (x % 2 == 1) {
            System.out.println(x + " is odd -> True");
        return;
        }
        System.out.println(x + " is odd -> False");
    }
    public static void isEven(int y){
        if (y%2==0){
            System.out.println(y + " is even -> True");
            return;
        }
        System.out.println(y + " is even -> False");
    }
}
/*
Create a class named OddAndEven:
	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);
			Output:
				false
	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);
			Output:
				true
 */







