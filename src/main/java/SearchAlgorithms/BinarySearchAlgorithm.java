package SearchAlgorithms;

public class BinarySearchAlgorithm {

    /**
     * Basic Iterative Binary Search algorithm that can find any object type in a 1-dimensional array both Target and Data storage can be objects or types.
     * The Big O notation for this search operation is O(log N) meaning that a sorted list of 64 items will take at most log2 (64) = 6 comparisons.
     * @param array The data input that is searched for the specified target value.
     * @param target The specified target that is searched for in the entered data storage.
     * @param <T>
     * @return
     */

    public static <T extends Comparable> int binarySearchIterative(T[] array, T target) {
        int left = 0;
        int right = array.length -1;
        int mid;

        while (left <= right){
            mid = left + (right - 1)/2;
            if (array[mid] == target)
                return mid;

            if (array[mid].compareTo(target) == -1)
                left = mid + 1;
            else
                right = mid -1;
        }
        return -1;

    }

    /**
     * Recursive Binary search algorithm that can find any object type in a 1-dimensional array both Target and Data storage can be objects or types.\
     * The Big O notation for this search operation is O(log N) meaning that a sorted list of 64 items will take at most log2 (64) = 6 comparisons.
     * @param <T>
     * @return
     */

    public static <T> int binarySearchRecursive(T[] array, T target){
        return -1;
    }
}
