import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void test_getLargestCommonDivisor() {
        Exercise1 exercise1 = new Exercise1();
        assertEquals(exercise1.getLargestCommonDivisor(27,18),9);
        assertEquals(exercise1.getLargestCommonDivisor(-27,0),27);
    }

    @Test
    public void test_getLowestCommonMultiples() {
        Exercise1 exercise1 = new Exercise1();
        assertEquals(exercise1.getLowestCommonMultiples(4,6),12);
    }
}
