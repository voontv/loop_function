import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise7Test {

    @Test
    public void test_totalInRange() {
        Exercise7 exercise7 = new Exercise7();
        assertEquals(exercise7.totalInRange(5),86400,86400);
    }
}
