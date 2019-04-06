import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise3Test {

    @Test
    public void test_isPrim() {
        Exercise3 exercise3 = new Exercise3();
        assertTrue(exercise3.isPrime(5));
        Assert.assertFalse(exercise3.isPrime(9));
    }

    @Test
    public void test_printDigitPrimeInRange() {
        Exercise3 exercise3 = new Exercise3();
        assertEquals(exercise3.printDigitPrimeInRange(600).toString(),"2 * 2 * 2 * 3 * 5 * 5");
    }
}
