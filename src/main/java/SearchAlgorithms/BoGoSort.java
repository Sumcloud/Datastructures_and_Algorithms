package SearchAlgorithms;

import java.util.Random;

public class BoGoSort {

    public static <T extends Comparable> int BoGoSort(T[] array, T target) {
        int random;
        do {
            random = new Random().nextInt(array.length - 1);
        } while (array[random] != target);
        return random;
    }
}
