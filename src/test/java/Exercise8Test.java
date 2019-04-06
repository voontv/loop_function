import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise8Test {

    @Test
    public void test_getFactorial() {
        Exercise8 exercise8 = new Exercise8();
        assertEquals(exercise8.getFactorial(5),120,0);
        assertEquals(exercise8.getFactorial(0),1,0);
    }
}
