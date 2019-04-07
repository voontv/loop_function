import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise18Test {
    final  Exercise18 exercise18 = new Exercise18();
    @Test
    public void test_printBinary() {
        assertEquals(exercise18.printBinary(23).toString(),"10111");
    }

    @Test
    public  void test_getDecimal() {
        assertEquals(exercise18.getDecimalReverse(23),29);
    }
}
