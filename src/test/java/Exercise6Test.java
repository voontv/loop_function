import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise6Test {

    @Test
    public void test_getDelta() {
        Exercise6 exercise6 = new Exercise6();
        assertEquals(exercise6.getDelta(2,-7,3),25,25);
        assertEquals(exercise6.getDelta(6,1,5),-119,-119);
    }

    @Test
    public void test_solveEquation() {
        Exercise6 exercise6 = new Exercise6();
        assertEquals(exercise6.solveEquation(6,1,5).toString(),"VN");
        assertEquals(exercise6.solveEquation(2,-7,3).toString(),"x1 = 3.0 x2 = 0.5");
        assertEquals(exercise6.solveEquation(1,-8,16).toString(),"x = 4.0");
        assertEquals(exercise6.solveEquation(9,-6, 1).toString(),"x = 0.33");
    }
}
