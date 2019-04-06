import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise4Test {

    @Test
    public void test_isPrim() {
        Exercise4 exercise4 = new Exercise4();
        assertTrue(exercise4.isPrime(5));
        Assert.assertFalse(exercise4.isPrime(9));
    }

    @Test
    public void test_printDigitPrimeInRange() {
        Exercise4 exercise4 = new Exercise4();
        assertEquals(exercise4.printDigitPrimeInRange(600).toString(),"2^3 * 3 * 5^2");
        assertEquals(exercise4.printDigitPrimeInRange(1965).toString(),"3 * 5 * 131");
    }
}
