package ir.clrs.algorithms.core.utils;

import java.util.Arrays;
import java.util.LinkedList;

public class PrintUtils {
    private static final boolean PRINT_IS_ACTIVE = false;

    public static void print(LinkedList<Integer> arr, String... prePrint) {
        if (PRINT_IS_ACTIVE) {
            if (prePrint != null)
                Arrays.stream(prePrint).forEach(System.out::println);
            for (int value : arr) System.out.print(value + " ");
            System.out.println();
        }
    }
}
