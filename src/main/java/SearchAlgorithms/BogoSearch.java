package SearchAlgorithms;

import java.util.Random;

public class BogoSearch {
    /**
     * DO NOT use this method :) this an UNLIMITED version that doesn't work if the target data might not be in the data storage.
     * This is a joke of a search method. The corresponding O notation O = (n)!
     * @param array Data storage to be searched
     * @param target Target to be searched for
     * @param <T> Data and target are generics.
     * @return returns an integer index value for the target
     */
    public static <T extends Comparable> int BoGoSearchUnlimited(T[] array, T target) {
        int random = 0;
        while (true){
            random = new Random().nextInt(array.length);
            if (array[random].equals(target))
                return random;
        }
    }

    /**
     * Do not use this search method. Is very much suboptimal, the guess attempts is limited at x3 the size of the given array.
     *
     * @param array Data storage to be searched
     * @param target Target to be searched for
     * @param <T> Data and target are generics.
     * @return returns an integer index value for the target, returns -1 if the data is not to be found in the given array.
     */
    public static <T extends Comparable> int BoGoSearchLimited(T[] array, T target){
        int random = 0;
        for (int i = 0; i < array.length*3; i++){
            random = new Random().nextInt(array.length);
            if (array[random].equals(target))
                return random;
        }
        return -1;
    }
}
