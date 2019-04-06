import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise11Test {

    @Test
    public void test_getInterestRateAfterYear() {
        Exercise11 exercise11 = new Exercise11();
        assertEquals(exercise11.getInterestRateAfterYear(1),200,0);
        assertEquals(exercise11.getInterestRateAfterYear(2),225,0);
        assertEquals(exercise11.getInterestRateAfterYear(4),244.140550,0.0001);
    }
}
