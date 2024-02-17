package day09_arrays_tasks;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String [] classMates = {"Khosiyat Akhmedova", "Marcela Vazquez", "Ridwan Khafagi", "Bengisu Karadeniz",
                "Gulbahor Gulbahor", "Marina Marina", "Nilufar Karimova", "Santiago Lopez",
                "Winniffer Diluyo", "Zakarya Ameen"};

        for (int i = 0; i < classMates.length; i++) {
            String name = classMates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);

        /*reverses from bottom to top
        for (int i = classMates.length - 1; i >= 0; i--) {
            System.out.println(classMates[i]);
        }*/
    }}
}
/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */