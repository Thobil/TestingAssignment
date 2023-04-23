package paint.shapes;

import paint.exceptions.NegativeValueException;

public class Circle extends GeneralShape implements BasicShape{


    private final double radius;

    public Circle(double radius, String name) throws NegativeValueException {
        super(name == null ? "Circle" : name);
        if(radius<0) throw new NegativeValueException();
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return ( this.radius * 2 * Math.PI );
    }

    @Override
    public double getArea() {
        return ( this.radius * this.radius * Math.PI);
    }

    @Override
    public String toString(){
        return (super.toString() + " of radius " + this.radius);
    }

}

