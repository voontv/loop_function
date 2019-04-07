import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise14Test {

    @Test
    public void test_getFactorial() {
        Exercise14 exercise14 = new Exercise14();
        assertEquals(exercise14.getFactorial(3),6,0);
        assertEquals(exercise14.getFactorial(0),1,0);
    }

    @Test
    public void test_totalFactorialInRange() {
        Exercise14 exercise14 = new Exercise14();
        assertEquals(exercise14.totalFactorialInRange(0.0001),2.7182814255731922,0.0001);
    }
}
