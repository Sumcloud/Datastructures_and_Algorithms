package SortAlgorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    Integer[] randomArray;
    Integer[] ascendingArray;
    Integer[] descendingArray;

    @Before
    public void setup() {
        randomArray = new Integer[]{35, 17, 67, 56, 13, 51, 1, 53, 86, 43, 95, 28, 15, 21, 92, 68, 9, 50, 75, 60, 40, 45, 48, 52, 7, 64, 26, 79, 11, 2, 18, 73, 3,
                46, 90, 33, 93, 42, 61, 96, 85, 22, 19, 58, 23, 62, 6, 44, 29, 78, 72, 70, 27, 32, 100, 74, 41, 36, 57, 65, 8, 14, 88, 98, 49,
                38, 69, 34, 20, 5, 54, 10, 24, 97, 25, 59, 99, 66, 81, 91, 83, 30, 4, 80, 37, 16, 77, 47, 94, 76, 55, 31, 89, 87, 12, 84, 39, 71, 82, 63};
        ascendingArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
                32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61,
                62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97,
                98, 99, 100};
        descendingArray = new Integer[]{100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    }

    @Test
    public void bubbleSortAscending() {
        BubbleSort.bubbleSort(randomArray, true);
        assertArrayEquals(ascendingArray, randomArray);
    }
    @Test
    public void bubbleSortDescending() {
        BubbleSort.bubbleSort(randomArray,false);
        assertArrayEquals(descendingArray,randomArray);
    }
}