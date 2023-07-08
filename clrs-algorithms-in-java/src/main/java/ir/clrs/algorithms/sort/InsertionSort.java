package ir.clrs.algorithms.sort;

import java.util.LinkedList;

public class InsertionSort {
    public static void sort(LinkedList<Integer> input) {
        int n = input.size();
        for (int i = 1; i < n; i++) {
            int key = input.get(i);
            int j = i - 1;
            // Move elements of input[0..i-1],
            // that are greater than key, to one position ahead of their current position
            while (j >= 0 && input.get(j) > key) input.set(j + 1, input.get(j--));
            input.set(j + 1, key);
        }
    }
}