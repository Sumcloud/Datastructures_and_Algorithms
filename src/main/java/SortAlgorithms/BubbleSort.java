package SortAlgorithms;

public class BubbleSort {
    /**
     * Bubblesort sorting method that works with every object as long as it implements the comparable interface.
     * Time complexity O(n^2), space complexity O(1)
     * @param array Data storage that is to be sorted
     * @param isAscending True if you want data to be sorted low to high and false for high to low.
     * @param <T> Can be generic type object.
     */
    public static <T extends Comparable> void bubbleSort(T[] array, boolean isAscending) {
        int n = array.length;
        T temp;
        //TODO this can be done nicer!
        if (isAscending) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j].compareTo(array[j + 1]) == 1) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j].compareTo(array[j + 1]) == -1) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }
}