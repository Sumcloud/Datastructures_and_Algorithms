package SearchAlgorithms;

import Utilities.ConstantTestValues;
import jdk.jfr.Name;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchAlgorithmTest implements ConstantTestValues {

    @Test
    public void iterativeBinarySearch() {
        assertEquals(integerArrayStudentNumbers[16],integerArrayStudentNumbers[BinarySearchAlgorithm.iterativeBinarySearch(integerArrayStudentNumbers,180681)]);
    }

    @Test
    public void iterativeBinarySearchReturnsNotFound(){
        assertEquals(-1, BinarySearchAlgorithm.iterativeBinarySearch(integerArrayStudentNumbers,999999));
    }

    @Test
    public void recursiveBinarySearch() {
    }
}