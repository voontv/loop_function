import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {

    @Test
    public void test_totalDigits() {
        Exercise2 exercise2 = new Exercise2();
        assertEquals(exercise2.totalDigits(27),9);
        assertEquals(exercise2.totalDigits(35),8);
    }

    @Test
    public void test_multiplicationDigits() {
        Exercise2 exercise2 = new Exercise2();
        assertEquals(exercise2.multiplicationDigits(27),14);
        assertEquals(exercise2.multiplicationDigits(35),15);
    }
}
