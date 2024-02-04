package day08_string_tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");

        String word = input.nextLine();
        if(word.charAt(0) == 'x')
           word = word.replaceFirst("x", "a");
        input.close();
        System.out.println(word);
    }
}
/*
Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */