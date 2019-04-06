import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise12Test {

    @Test
    public void test_getFactorial() {
        Exercise12 exercise12 = new Exercise12();
        assertEquals(exercise12.getFactorial(3),6,0);
        assertEquals(exercise12.getFactorial(0),1,0);
    }

    @Test
    public void test_totalFactorialInRange() {
        Exercise12 exercise12 = new Exercise12();
        assertEquals(exercise12.totalFactorialInRange(3),10,0);
        assertEquals(exercise12.totalFactorialInRange(0),1,0);
        assertEquals(exercise12.totalFactorialInRange(0),1,0);
    }
}
