import SearchAlgorithms.BasicLinearSearch;
import Utilities.ConstantTestValues;
import Utilities.Product;

import static org.junit.Assert.*;

public class BasicLinearSearchTest implements ConstantTestValues {

    @org.junit.Test
    public void linearSearch1dStrings() {
        assertEquals(13, BasicLinearSearch.linearSearch1d(stringArray1dDaftPunk,"Random Access Memories"));
    }
    @org.junit.Test
    public void linearSearch1dIntegers(){
        assertEquals(16,BasicLinearSearch.linearSearch1d(integerArrayStudentNumbers,180681));
    }
    @org.junit.Test
    public void linearSearchReturnsNegativeIfNotFound(){
        assertEquals(-1,BasicLinearSearch.linearSearch1d(stringArray1dDaftPunk,"With The Beatles"));
    }
    @org.junit.Test
    public void linearSearchObjects(){
        assertEquals(37,BasicLinearSearch.linearSearch1d(productArray,new Product("Sponges 3pcs",0.90)));
    }

    @org.junit.Test
    public void linearSearch2d() {
        assertArrayEquals(new int[]{10, 2},BasicLinearSearch.linearSearch2d(basicInteger2dArray,52));
    }
}