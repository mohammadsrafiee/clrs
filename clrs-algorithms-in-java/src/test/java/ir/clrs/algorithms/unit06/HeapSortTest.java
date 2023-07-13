package ir.clrs.algorithms.unit06;

import ir.clrs.algorithms.core.utils.PrintUtils;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class HeapSortTest {
    @Test
    public void doHeapSortTest() {
        LinkedList<Integer> input = new LinkedList<>();
        input.add(12);
        input.add(11);
        input.add(13);
        input.add(5);
        input.add(6);
        input.add(7);
        PrintUtils.print(input, "Original array:");
        HeapSort.sort(input);
        PrintUtils.print(input, "Sorted array:");
    }
}