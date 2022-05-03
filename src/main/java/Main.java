import SearchAlgorithms.BinarySearchAlgorithm;
import SearchAlgorithms.BogoSearch;
import SortAlgorithms.BubbleSort;
import SortAlgorithms.MergeSort;
import Utilities.ConstantTestValues;

import java.util.ArrayList;
import java.util.List;

public class Main implements ConstantTestValues {
    public static void main(String[] args) {
        /**
         Album[] albums = new Album[0];
         try {
         albums = ConstantTestValues.massAlbumCreator();
         }catch (ArrayMismatchException e){
         e.printStackTrace();
         } **/
        //System.out.println(new Integer(1).compareTo(2));
        //System.out.println(BinarySearchAlgorithm.recursiveBinarySearch(integerArrayStudentNumbers,180681, 0, integerArrayStudentNumbers.length-1));

        Integer[] array = {10, 1, 3, 8, 4, 5, 9, 10, 2, 6, 7, 11};
        MergeSort.mergeSort(array, array.length);
        //BubbleSort.bubbleSort(array,true);
        for (Integer x : array){
            System.out.println(x);
        }
    }
}
