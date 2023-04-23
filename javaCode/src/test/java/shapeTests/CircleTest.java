package shapeTests;

import org.junit.jupiter.api.Test;
import paint.exceptions.NegativeValueException;
import paint.shapes.Circle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CircleTest {

    public static final double DELTA = 0.00001;

    /**
     * Tests if  Circle class method getArea() returns correct result.
     */
    @Test
    public void testGetArea() throws NegativeValueException {
        Circle instance = new Circle(10, "TestCircle");
        var result = instance.getArea();
        double expResult = 314.15927;
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Tests if Circle class method getPerimeter() returns correct result.
     */
    @Test
    public void testGetPerimeter() throws NegativeValueException {
        Circle instance = new Circle(10, "TestCircle");
        var result = instance.getPerimeter();
        double expResult = 62.83185;
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test if class Circle throws NegativeValueException if invoked with negative radius.
     */
    @Test
    public void testThrowsNegativeValueException() {
        assertThrows(NegativeValueException.class, () -> new Circle(-10, "TestCircle"));
    }
}
