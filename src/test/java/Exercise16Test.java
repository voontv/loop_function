import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise16Test {
    final Exercise16 exercise16 = new Exercise16();

    @Test
    public void test_getEdgeLength() {
        assertEquals(exercise16.getEdgeLength(1,5,2,1),4.12,0.01);
    }

    @Test
    public void test_isTriangleSquare() {
        assertTrue(exercise16.isTriangleSquare(2,0,4,3,2,-1));
        assertFalse(exercise16.isTriangleSquare(2,0,4,7,2,-1));
    }

    @Test
    public void test_isIsoscelesTriangle() {
        assertTrue(exercise16.isIsoscelesTriangle(-1,1,2,1,3,0));
        assertFalse(exercise16.isIsoscelesTriangle(-1,1,9,1,3,0));
    }

    @Test
    public void test_isEquilateralTriangle() {
        assertFalse(exercise16.isEquilateralTriangle(2,4,5,-1,-4,7));
    }

    @Test
    public void test_getCircumferenceTriangle() {
        assertEquals(exercise16.getCircumferenceTriangle(2,4,5,-1,-4,7),23.19481603796878,0.001);
    }

    @Test
    public void test_getAreaTriangle() {
        assertEquals(exercise16.getAreaTriangle(2,4,5,-1,-4,7),12.5,0.001);
    }

}
