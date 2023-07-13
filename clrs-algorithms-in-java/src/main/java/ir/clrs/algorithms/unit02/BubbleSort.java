package ir.clrs.algorithms.unit02;

import java.util.LinkedList;

public class BubbleSort {

    public static <T extends Comparable<T>> void sort(LinkedList<T> input) {
        int n = input.size();
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap adjacent elements if they are in the wrong order
                if (input.get(j).compareTo(input.get(j + 1)) > 0) {
                    T temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                }
            }
        }
    }
}