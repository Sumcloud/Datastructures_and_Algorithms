package SearchAlgorithms;

public class BasicLinearSearch {
    /**
     * A basic linear search algorithm that can find any object type in a 1-dimensional array both Target and Data storage can be objects or types.
     * The Big O notation for this method is O(N) as the complexity is directly related to the size of the input array.
     *
     * @param array The data input that is searched for the specified target value.
     * @param target The specified target that is searched for in the entered data storage.
     * @param <T> Method works with all data types.
     * @return Returns an Integer index value that the specified target is stored in the specified data storage.
     */

    public static <T> int linearSearch1d(T[] array, T target){

        for (int i = 0; i < array.length; i++){
            if (array[i].equals(target))
                return i;
        }
        return -1;
    }

    /**
     * A basic linear search algorithm that can find any object type in a 2-dimensional array both Target and Data storage can be objects or types.
     * The Big O notation for this method is O(N * M) as the complexity is directly related to the size of the input array. N = n.o of rows and M = the n.o of columns.
     *
     * @param array The 2-dimensional data array input that is searched for the specified target value.
     * @param target The specified target that is searched for in the entered data storage.
     * @param <T> Method works with all data types.
     * @return Returns an Integer array with the target's coordinates within the 2-d storage array. Format for the array is as follows: {Y,X}
     */
    public static <T> int[] linearSearch2d(T[][] array, T target){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j].equals(target)){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
