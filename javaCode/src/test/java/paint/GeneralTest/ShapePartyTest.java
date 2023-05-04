package paint.GeneralTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import paint.exceptions.NegativeValueException;
import paint.shapes.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class ShapePartyTest {

    public static final double DELTA = 0.00001;

    /**
     * Tests if ShapeParty class method calculTotalArea() returns correct result.
     */
    @Test
    public void testCalculTotalArea() throws NegativeValueException {
        List<BasicShape> listShapes = new ArrayList<>();

        listShapes.add(new Square(10, null));
        listShapes.add(new Rectangle(10,15, null));
        listShapes.add(new Circle(5.0, "Circle A"));

        ShapeParty instance = new ShapeParty(listShapes);

        var result = instance.calculTotalArea();

        double expSquareArea = 100;
        double expRectangleArea = 150;
        double expCircleArea = 78.53982;

        double expResult = expSquareArea + expRectangleArea + expCircleArea;

        assertEquals(expResult, result, DELTA);
    }
    /**
     * Tests if ShapeParty class method calculTotalPerimeter() returns correct result.
     */
    @Test
    public void testCalculTotalPerimeter() throws NegativeValueException {
        List<BasicShape> listShapes = new ArrayList<>();

        listShapes.add(new Square(10, null));
        listShapes.add(new Rectangle(10,15, null));
        listShapes.add(new Circle(5.0, "Circle A"));

        ShapeParty instance = new ShapeParty(listShapes);

        var result = instance.calculTotalPerimeter();

        double expSquareArea = 40;
        double expRectangleArea = 50;
        double expCircleArea = 31.41593;

        double expResult = expSquareArea + expRectangleArea + expCircleArea;

        assertEquals(expResult, result, DELTA);
    }

    /**
     * Tests if ShapeParty class methods for adding and removing work correctly.
     */
    @Test
    public void testAddingAndRemovingShapes() throws NegativeValueException {
        List<BasicShape> listShapes = new ArrayList<>();

        BasicShape square = new Square(10, null);
        BasicShape rectangle = new Rectangle(10,15, null);
        BasicShape circle = new Circle(5.0, "Circle A");

        listShapes.add(rectangle);
        listShapes.add(circle);

        ShapeParty instance = new ShapeParty(new ArrayList<>());

        //test method addShape()
        instance.addShape(square);
        double expResult = 1;
        double result = instance.shapes.size();

        assertEquals(expResult, result);

        // test method addShapes()
        instance.addShapes(listShapes);
         expResult = 3;
         result = instance.shapes.size();

        assertEquals(expResult, result);

        // test method removeShape()
        instance.removeShape(square);
        expResult = 2;
        result = instance.shapes.size();

        assertEquals(expResult, result);

        // test method removeAllShapes()
        instance.removeAllShapes();
        expResult = 0;
        result = instance.shapes.size();

        assertEquals(expResult, result);
    }



    @Mock
    private BasicShape shape1;
    @Mock
    private BasicShape shape2;
    @Mock
    private BasicShape shape3;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Test class ShapeParty function calculTotalArea() independently of other classes.
     */
    @Test
    public void mockTest() {

        when(shape1.getArea()).thenReturn(10.0);
        when(shape2.getArea()).thenReturn(10.0);
        when(shape3.getArea()).thenReturn(10.0);

        List<BasicShape> listShapes = new ArrayList<>();

        listShapes.add(shape1);
        listShapes.add(shape2);
        listShapes.add(shape3);

        ShapeParty instance = new ShapeParty(listShapes);

        assertEquals(30, instance.calculTotalArea());
    }

    @Test
    public void removeTest() throws NegativeValueException {
        List<BasicShape> listShapes = new ArrayList<>();

        Square s = new Square(10, null);

        listShapes.add(s);
        listShapes.add(new Rectangle(10,15, null));
        listShapes.add(new Circle(5.0, "Circle A"));

        ShapeParty instance = new ShapeParty(listShapes);

        assertTrue(instance.removeShape(s));
        assertFalse(instance.removeShape(s));
    }

    @Test
    public void nameTest() throws NegativeValueException {
        List<BasicShape> listShapes = new ArrayList<>();

        Square s = new Square(10, null);

        listShapes.add(s);
        listShapes.add(new Rectangle(10,15, null));
        listShapes.add(new Circle(5.0, "Circle A"));

        ShapeParty instance = new ShapeParty(listShapes);

        assertNotEquals("", instance.toString());
    }
}
