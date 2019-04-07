import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercis9Test {

    @Test
    public void test_getPi() {
        Exercise9 exercise9 = new Exercise9();
        assertEquals(exercise9.getPi(0.0001),3.1347,0.0001);
    }
}
