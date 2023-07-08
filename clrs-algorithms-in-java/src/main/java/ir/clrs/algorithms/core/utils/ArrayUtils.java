package ir.clrs.algorithms.core.utils;

import java.util.LinkedList;

public class ArrayUtils {

    public static void print(LinkedList<Integer> arr) {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }
}
