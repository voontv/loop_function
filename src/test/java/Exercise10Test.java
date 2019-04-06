import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise10Test {

    @Test
    public void test_getPi() {
        Exercise10 exercise10 = new Exercise10();
        assertEquals(exercise10.getPI(0.00001),3.16667,0.00001);
    }
}
