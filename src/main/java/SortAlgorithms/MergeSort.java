package SortAlgorithms;

/**
 * This is a Merge sort algorithm that works with all objects that implement the Comparable interface.
 * The Big O notation for this algorithm should be O(nLogN) for worst,average and best case.
 *
 */
public class MergeSort {
    public static <T extends Comparable> void mergeSort(T[] array, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        T[] left = (T[]) new Comparable[mid];
        T[] right = (T[]) new Comparable[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(array, left, right, mid, n - mid);
    }

    public static <T extends Comparable> void merge(T[] array, T[] left, T[] right, int Ileft, int Iright) {
        int i = 0, j = 0, k = 0;

        while (i < Ileft && j < Iright) {
            //TODO this if statement can be optimized by reversing it!
            if (left[i].compareTo(right[j]) == 0 || left[i].compareTo(right[j]) == -1) {
                array[k++] = left[i++];
            }
            else array[k++] = right[j++];
        }
        while (i < Ileft){
            array[k++] = left[i++];
        }
        while (j < Iright){
            array[k++] = right[j++];
        }
    }

}
