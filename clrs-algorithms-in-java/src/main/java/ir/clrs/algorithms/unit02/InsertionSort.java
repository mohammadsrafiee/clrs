package ir.clrs.algorithms.unit02;

import java.util.LinkedList;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(LinkedList<T> input) {
        int n = input.size();
        for (int i = 1; i < n; i++) {
            T key = input.get(i);
            int j = i - 1;
            // Move elements of input[0..i-1],
            // that are greater than key, to one position ahead of their current position
            while (j >= 0 && input.get(j).compareTo(key) > 0) input.set(j + 1, input.get(j--));
            input.set(j + 1, key);
        }
    }
}