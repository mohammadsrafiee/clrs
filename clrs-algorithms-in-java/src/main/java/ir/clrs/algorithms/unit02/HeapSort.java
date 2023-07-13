package ir.clrs.algorithms.unit02;

import java.util.LinkedList;

public class HeapSort {

    public static <T extends Comparable<T>> void sort(LinkedList<T> input) {
        int n = input.size();
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(input, n, i);
        }

        // Extract elements from heap in descending order
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            T temp = input.get(0);
            input.set(0, input.get(i));
            input.set(i, temp);
            // Heapify the reduced heap
            heapify(input, i, 0);
        }
    }

    private static <T extends Comparable<T>> void heapify(LinkedList<T> input, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        // Check if left child is larger than root
        if (left < n && input.get(left).compareTo(input.get(largest)) > 0) largest = left;
        if (right < n && input.get(right).compareTo(input.get(largest)) > 0) largest = right;
        // If largest is not the root, swap and heapify the affected subtree
        if (largest != i) {
            T swap = input.get(i);
            input.set(i, input.get(largest));
            input.set(largest, swap);
            heapify(input, n, largest);
        }
    }
}
