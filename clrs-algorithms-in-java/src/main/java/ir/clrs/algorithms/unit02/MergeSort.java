package ir.clrs.algorithms.unit02;

import java.util.LinkedList;

public class MergeSort {

    public static <T extends Comparable<T>> void sort(LinkedList<T> input) {
        if ((input == null) || (input.size() <= 1)) return;
        int n = input.size();
        int mid = n / 2;
        // Divide the array into two halves
        LinkedList<T> left = new LinkedList<>(input.subList(0, mid));
        LinkedList<T> right = new LinkedList<>(input.subList(mid, n));
        // Recursively sort the two halves
        sort(left);
        sort(right);
        // Merge the sorted halves
        merge(input, left, right);
    }

    private static <T extends Comparable<T>> void merge(LinkedList<T> input, LinkedList<T> left, LinkedList<T> right) {
        int i = 0, // Index for left subarray
                j = 0,// Index for right subarray
                k = 0; // Index for merged array
        while (i < left.size() && j < right.size()) {
            if (right.get(j).compareTo(left.get(i)) >= 0) input.set(k++, left.get(i++));
            else input.set(k++, right.get(j++));
        }
        // Copy remaining elements from left subarray
        while (i < left.size()) input.set(k++, left.get(i++));
        // Copy remaining elements from right subarray
        while (j < right.size()) input.set(k++, right.get(j++));
    }
}
