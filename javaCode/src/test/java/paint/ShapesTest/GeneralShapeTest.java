package paint.ShapesTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import paint.shapes.GeneralShape;

public class GeneralShapeTest {
    @Test
    public void generalShapeBasicTest(){
        GeneralShape gs = new GeneralShape("shape");
        Assertions.assertEquals("shape",gs.toString());
    }
}
