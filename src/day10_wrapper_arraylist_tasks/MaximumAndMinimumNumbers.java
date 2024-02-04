package day10_wrapper_arraylist_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int max = Collections.max(numbers);
        System.out.println("Maximum number: " + max);
        int min = Collections.min(numbers);
        System.out.println("Minimum number: " + min);
    }
}
/*
Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */