package shapeTests;

import org.junit.jupiter.api.Test;
import paint.exceptions.NegativeValueException;
import paint.shapes.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    public static final double DELTA = 0.00001;

    /**
     * Tests if Square class method getArea() returns correct result.
     */
    @Test
    public void testGetArea() throws NegativeValueException {
        Square instance = new Square(10, "TestRectangle");
        var result = instance.getArea();
        double expResult = 100;
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Tests if Square class method getPerimeter() returns correct result.
     */
    @Test
    public void testGetPerimeter() throws NegativeValueException {
        Square instance = new Square(10, "TestRectangle");
        var result = instance.getPerimeter();
        double expResult = 40;
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test if class Square throws NegativeValueException if invoked with negative radius.
     */
    @Test
    public void testThrowsNegativeValueException() {
        assertThrows(NegativeValueException.class, () -> new Square(-10, "TestRectangle"));
    }
}
