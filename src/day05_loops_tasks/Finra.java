package day05_loops_tasks;

public class Finra {

    public static void main(String[] args) {
        int n = 100;
        int number = 1;

        do {
            if (number%3 == 0 && number %5==0){
                System.out.print("Finra ");
            } else if (number%3==0){
                System.out.print("Fin ");
            } else if (number%5==0) {
                System.out.print("Ra ");
            }   else{
                System.out.print(number + " ");
            }
            number++;

        }while (number<=n);
    }
}
/*
Create a class named FINRA. and write a program that prints the numbers from 1 to 100. For numbers that
are multiples of both 3 and 5, print "FINRA" instead of the number. For numbers that are multiples of 3, print
"FIN" instead of the number, and for numbers that are multiples of 5, print "RA" instead of the number.

				Example:
					1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN...
 */
