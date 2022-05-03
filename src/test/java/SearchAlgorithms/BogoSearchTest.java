package SearchAlgorithms;

import Utilities.ConstantTestValues;
import org.junit.Test;

import static org.junit.Assert.*;

public class BogoSearchTest implements ConstantTestValues {

    @Test
    public void boGoSearchUnlimited() {
        assertEquals(16,BogoSearch.BoGoSearchUnlimited(integerArrayStudentNumbers,180681));
    }

    @Test
    public void boGoSearchLimited() {
        assertEquals(16,BogoSearch.BoGoSearchLimited(integerArrayStudentNumbers,180681));
    }
    @Test
    public void boGoSearchLimitedReturnsNotFound(){
        assertEquals(-1,BogoSearch.BoGoSearchLimited(integerArrayStudentNumbers,999999));
    }
}