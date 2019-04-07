import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise15Test {
    final Exercise15 exercise15 = new Exercise15();

    @Test
    public void test_isTriangle() {
        assertTrue(exercise15.isTriangle(12.3,14.8,21));
        assertFalse(exercise15.isTriangle(12.3,14.8,48));
    }

    @Test
    public void test_isTriangleSquare() {
        assertTrue(exercise15.isTriangleSquare(3.0,4.0,5.0));
        assertFalse(exercise15.isTriangleSquare(12.3,14.8,21));
    }

    @Test (expected = RuntimeException.class)
    public void test_isTriangleSquareRuntimeException() {
        exercise15.isTriangleSquare(12.3,14.8,48);
    }

    @Test
    public void test_isIsoscelesTriangle() {
        assertFalse(exercise15.isIsoscelesTriangle(14.0,12.3,16.8));
        assertTrue(exercise15.isIsoscelesTriangle(14.0,14.0,16.8));
    }

    @Test (expected = RuntimeException.class)
    public void test_isIsoscelesTriangleRuntimeException() {
        exercise15.isIsoscelesTriangle(14.0,12.3,66.8);
        exercise15.isIsoscelesTriangle(14.0,14.0,76.8);
    }

    @Test
    public void test_isEquilateralTriangle() {
        assertFalse(exercise15.isEquilateralTriangle(23.3,12.5,18.9));
        assertTrue(exercise15.isEquilateralTriangle(23.3,23.3,23.3));
    }

    @Test (expected = RuntimeException.class)
    public void test_isEquilateralTriangleRuntimeException() {
        exercise15.isEquilateralTriangle(23.3,12.5,88.9);
    }

    @Test
    public void test_getCircumferenceTriangle() {
        assertEquals(exercise15.getCircumferenceTriangle(4,3,5),12,0);
    }

    @Test(expected = RuntimeException.class)
    public void test_getCircumferenceTriangleRuntimeException() {
        exercise15.getCircumferenceTriangle(23.3,12.5,88.9);
    }

    @Test
    public void test_getAreaTriangle() {
        assertEquals(exercise15.getAreaTriangle(4,3,5),6,0);
    }

    @Test(expected = RuntimeException.class)
    public void test_getAreaTriangleRuntimeException() {
        exercise15.getAreaTriangle(23.3,12.5,88.9);
    }
}
