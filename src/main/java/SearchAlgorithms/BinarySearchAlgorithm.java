package SearchAlgorithms;

import java.util.concurrent.RecursiveTask;

public class BinarySearchAlgorithm {

    /**
     * This is a iterative Binary search function that works with all objects as long as they are comparable.
     * Due to the nature of this search method it only works on SORTED lists and the function DOES NOT sort the input.
     * The Big O notation for this search operation is O(log N) meaning that a sorted list of 64 items will take at most log2 (64) = 6 comparisons.
     *
     * @param <T> Works with all types of objects (IMPLEMENTATION OF THE COMPARABLE INTERFACE IS REQUIRED!).
     * @param array Storage array of any type (Generic)
     * @param target Target data (Generic)
     * @return The function returns the targets index in the given array, if the index is not found it returns -1.
     */
    public static <T extends Comparable> int iterativeBinarySearch(T[] array, T target) {
        int left = 0, right = array.length -1, mid;
        while (left < right){
            mid = (left + right-1)/2;
            int tmp = array[mid].compareTo(target);

            System.out.println(array[mid]);
            switch(tmp){
                case 0: return mid;
                case -1:
                    left = mid + 1;
                    break;
                case 1: right = mid -1;
            }
        }
        return -1;
    }

    public static <T extends Comparable> int recursiveBinarySearch() {
        return 0;
    }

}
