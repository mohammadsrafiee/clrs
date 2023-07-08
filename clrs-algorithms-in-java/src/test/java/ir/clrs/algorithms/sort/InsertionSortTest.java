package ir.clrs.algorithms.sort;

import ir.clrs.algorithms.core.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class InsertionSortTest {

    @Test
    public void doInsertionSortTest() {
        LinkedList<Integer> input = new LinkedList<>();
        input.add(12);
        input.add(11);
        input.add(13);
        input.add(5);
        input.add(6);
        input.add(7);
        System.out.println("Original array:");
        ArrayUtils.print(input);
        InsertionSort.sort(input);
        System.out.println("Sorted array:");
        ArrayUtils.print(input);
    }
}