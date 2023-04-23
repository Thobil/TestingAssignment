package paint.launcher;

import paint.exceptions.NegativeValueException;
import paint.shapes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BasicShape> drawing = new ArrayList<>();

        try{
            drawing.add(new Circle(8.0, null));
            drawing.add(new Circle(10.0, null));
            drawing.add(new Circle(5.0, "Circle A"));
            drawing.add(new Circle(47.8, "Circle B"));
            drawing.add(new Circle(8.0, "Circle C"));
            drawing.add(new Circle(20.0, "Circle D"));
            drawing.add(new Circle(5.0, "Circle E"));

            drawing.add(new Rectangle(8, 58, "Henrique the rectangle"));

            drawing.add(new Rectangle(0,0, null));
            drawing.add(new Rectangle(10,0, null));
            drawing.add(new Rectangle(50,50, null));

            drawing.add(new Square(0, null));
            //drawing.add(new Square(-10, null));
        }catch (NegativeValueException nve){
            nve.printStackTrace();
        }

        ShapeParty shapeParty = new ShapeParty(drawing);

        System.out.println("Calcul area size : " + shapeParty.calculTotalArea() + " cm");
        System.out.println("Calcul perimeter size : " + shapeParty.calculTotalPerimeter() + " cm");

        System.out.println(shapeParty);
    }
}
