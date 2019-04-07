import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {

    @Test
    public void test_getFiboInPosition() {
        Exercise5 exercise5 = new Exercise5();
        assertEquals(exercise5.getFiboInPosition(5),5);
        assertEquals(exercise5.getFiboInPosition(6),8);
    }

    @Test
    public void test_printDigitFiboInRange() {
        Exercise5 exercise5 = new Exercise5();
        assertEquals(exercise5.printDigitFiboInRange(10).toString(),"1 1 2 3 5 8");
    }
}
