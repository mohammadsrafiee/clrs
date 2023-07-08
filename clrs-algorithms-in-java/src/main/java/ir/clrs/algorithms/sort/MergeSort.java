package ir.clrs.algorithms.sort;

import java.util.LinkedList;

public class MergeSort {

    public static void sort(LinkedList<Integer> input) {
        if ((input == null) || (input.size() <= 1)) return;
        int n = input.size();
        int mid = n / 2;
        // Divide the array into two halves
        LinkedList<Integer> left = new LinkedList<>(input.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(input.subList(mid, n));
        // Recursively sort the two halves
        sort(left);
        sort(right);
        // Merge the sorted halves
        merge(input, left, right);
    }

    private static void merge(LinkedList<Integer> input, LinkedList<Integer> left, LinkedList<Integer> right) {
        int i = 0, // Index for left subarray
                j = 0,// Index for right subarray
                k = 0; // Index for merged array
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) input.set(k++, left.get(i++));
            else input.set(k++, right.get(j++));
        }
        // Copy remaining elements from left subarray
        while (i < left.size()) input.set(k++, left.get(i++));
        // Copy remaining elements from right subarray
        while (j < right.size()) input.set(k++, right.get(j++));
    }
}
