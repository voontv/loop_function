import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise13Test {

    @Test
    public void test_getFactorial() {
        Exercise13 exercise13 = new Exercise13();
        assertEquals(exercise13.getFactorial(3),6,0);
        assertEquals(exercise13.getFactorial(0),1,0);
    }

    @Test
    public void test_totalFactorialInRange() {
        Exercise13 exercise13 = new Exercise13();
        assertEquals(exercise13.totalFactorialInRange(0.00001),2.7182814255731922,0.00001);
    }
}
