import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise17Test {
    final Exercise17 exercise17 = new Exercise17();
    @Test
    public void test_countNumberDigit() {
        assertEquals(exercise17.countNumberDigit(23),2);
        assertEquals(exercise17.countNumberDigit(234),3);
        assertEquals(exercise17.countNumberDigit(2),1);
        assertEquals(exercise17.countNumberDigit(0),0);
    }

    @Test
    public  void test_isCorrectRule() {
        assertTrue(exercise17.isLengthDigitCorrectRule(234));
        assertTrue(exercise17.isLengthDigitCorrectRule(24));
        assertTrue(exercise17.isLengthDigitCorrectRule(2444));
        assertFalse(exercise17.isLengthDigitCorrectRule(1));
        assertFalse(exercise17.isLengthDigitCorrectRule(145556));
    }

    @Test
    public  void test_isDigitCorrectRule() {
        assertTrue(exercise17.isDigitCorrectRule(153));
        assertFalse(exercise17.isDigitCorrectRule(1533));
        assertFalse(exercise17.isDigitCorrectRule(3));
    }

    @Test
    public void test_printisDigitCorrectRuleInRange() {
        assertEquals(exercise17.printisDigitCorrectRuleInRange().toString(),"153 370 371 407 1634 8208 9474 54748 92727 93084 ");
    }
}
