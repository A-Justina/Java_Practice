package day09_arrays_tasks;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String [] classMates = {"Khosiyat Akhmedova", "Marcela Vazquez", "Ridwan Khafagi", "Bengisu Karadeniz",
                "Gulbahor Gulbahor", "Marina Marina", "Nilufar Karimova", "Santiago Lopez",
                "Winniffer Diluyo", "Zakarya Ameen"};
        //String [] reversedNames = new String[classMates.length];

        for (int i = classMates.length - 1; i >= 0; i--) {
            System.out.println(classMates[i]);
        }
    }
}
/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */