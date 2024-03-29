package day10_wrapper_arraylist_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
      ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
      ArrayList <Integer> newList = new ArrayList<>();

        for (Integer each : list) {
            if (!newList.contains(each)){
                newList.add(each);
            }
        }
        System.out.println(newList);
    }
}
/*
Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */