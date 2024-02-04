package day10_wrapper_arraylist_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        elements.removeIf(p->elements.indexOf(p) != elements.lastIndexOf(p));

        System.out.println(elements);
    }
}
