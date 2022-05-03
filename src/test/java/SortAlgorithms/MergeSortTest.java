package SortAlgorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {
    Integer randomArray[];
    Integer ascendingArray[];

    @Before
    public void setUp() throws Exception {
        randomArray = new Integer[]{35, 17, 67, 56, 13, 51, 1, 53, 86, 43, 95, 28, 15, 21, 92, 68, 9, 50, 75, 60, 40, 45, 48, 52, 7, 64, 26, 79, 11, 2, 18, 73, 3,
                46, 90, 33, 93, 42, 61, 96, 85, 22, 19, 58, 23, 62, 6, 44, 29, 78, 72, 70, 27, 32, 100, 74, 41, 36, 57, 65, 8, 14, 88, 98, 49,
                38, 69, 34, 20, 5, 54, 10, 24, 97, 25, 59, 99, 66, 81, 91, 83, 30, 4, 80, 37, 16, 77, 47, 94, 76, 55, 31, 89, 87, 12, 84, 39, 71, 82, 63};
        ascendingArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
                32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61,
                62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97,
                98, 99, 100};
    }
    @Test
    public void mergeSort() {
        MergeSort.mergeSort(randomArray, randomArray.length);
        assertArrayEquals(ascendingArray,randomArray);
    }
}