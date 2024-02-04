package day10_wrapper_arraylist_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida"));

        list.removeIf(p->p.toUpperCase().charAt(0) == p.toUpperCase().charAt(p.length()-1));
        System.out.println(list);
    }
}
/*
Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Lan", "Ebrahim", "Farida"]
 */