package shapeTests;

import org.junit.jupiter.api.Test;
import paint.exceptions.NegativeValueException;
import paint.shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    public static final double DELTA = 0.00001;

    /**
     * Tests if Rectangle class method getArea() returns correct result.
     */
    @Test
    public void testGetArea() throws NegativeValueException {
        Rectangle instance = new Rectangle(10, 15, "TestRectangle");
        var result = instance.getArea();
        double expResult = 150;
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Tests if Rectangle class method getPerimeter() returns correct result.
     */
    @Test
    public void testGetPerimeter() throws NegativeValueException {
        Rectangle instance = new Rectangle(10, 15, "TestRectangle");
        var result = instance.getPerimeter();
        double expResult = 50;
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test if class Rectangle throws NegativeValueException if invoked with negative radius.
     */
    @Test
    public void testThrowsNegativeValueException() {
        assertThrows(NegativeValueException.class, () -> new Rectangle(-10, 15, "TestRectangle"));
    }
}
