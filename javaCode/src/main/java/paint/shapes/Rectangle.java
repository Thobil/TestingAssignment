package paint.shapes;

import paint.exceptions.NegativeValueException;

public class Rectangle extends GeneralShape implements BasicShape  {

    private final double length;
    private final double height;

    public Rectangle(double length, double height, String name) throws NegativeValueException {
        super(name == null ? "Rectangle" : name);
        if(length < 0 || height < 0) throw new NegativeValueException();
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return ( this.length * this.height );
    }

    @Override
    public double getPerimeter() {
        return ( 2 * this.length + 2 * this.height );
    }

    @Override
    public String toString(){
        return (super.toString() + " of length " + this.length + " and of height " + this.height);
    }
}
