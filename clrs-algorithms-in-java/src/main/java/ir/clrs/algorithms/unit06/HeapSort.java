package ir.clrs.algorithms.unit06;

import java.util.LinkedList;

public class HeapSort {

    public static <T extends Comparable<T>> void sort(LinkedList<T> input) {
        int n = input.size();
        // Build max heap
        buildMaxHeap(input);
        // Extract elements from the heap in sorted order
        for (int i = n - 1; i > 0; i--) {
            // Swap root (maximum element) with the last element
            swap(input, 0, i);
            // Reduce heap size and heapify the root element
            maxHeapify(input, i, 0);
        }
    }

    private static <T extends Comparable<T>> void buildMaxHeap(LinkedList<T> input) {
        int n = input.size();
        // Start from the last non-leaf node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(input, n, i);
    }

    private static <T extends Comparable<T>> void maxHeapify(LinkedList<T> array, int heapSize, int rootIndex) {
        int largest = rootIndex;  // Initialize largest as the root
        int left = left(rootIndex);
        int right = right(rootIndex);
        // Compare root with left child
        if (left < heapSize && array.get(left).compareTo(array.get(largest)) > 0)
            largest = left;
        // Compare root with right child
        if (right < heapSize && array.get(right).compareTo(array.get(largest)) > 0)
            largest = right;
        // If the largest is not the root, swap and recursively heapify the affected subtree
        if (largest != rootIndex) {
            swap(array, rootIndex, largest);
            maxHeapify(array, heapSize, largest);
        }
    }

    private static <T extends Comparable<T>> void swap(LinkedList<T> input, int i, int j) {
        T temp = input.get(i);
        input.set(i, input.get(j));
        input.set(j, temp);
    }

    private static int parent(int i) {
        return (i - 1) / 2;
    }

    private static int left(int i) {
        return 2 * i + 1;
    }

    private static int right(int i) {
        return 2 * i + 2;
    }

}
