package paint.shapes;

import paint.Exceptions.NegativeValueException;

public class Square extends Rectangle{
    public Square(double edge, String name) throws NegativeValueException {
        super(edge,edge,name == null ? "Square" : name);
    }
}
