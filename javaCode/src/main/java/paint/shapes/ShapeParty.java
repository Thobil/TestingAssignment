package paint.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeParty {
    List<BasicShape> shapes;

    public ShapeParty(){
        this.shapes = new ArrayList<>();
    }

    public ShapeParty(List<BasicShape> listShapes){
        this();
        addShapes(listShapes);
    }

    public void addShape(BasicShape shape){
        this.shapes.add(shape);
    }

    public void addShapes(List<BasicShape> listShapes){
        this.shapes.addAll(listShapes);
    }

    public boolean removeShape(BasicShape shape){
        return this.shapes.remove(shape);
    }

    public void removeAllShapes(){
        this.shapes.clear();
    }

    public double calculTotalArea(){
        double count = 0;
        for(BasicShape shape : shapes){
            count += shape.getArea();
        }
        return count;
    }

    public double calculTotalPerimeter(){
        double count = 0;
        for(BasicShape shape : shapes){
            count += shape.getPerimeter();
        }
        return count;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("****************").append(" Party Content : \n");
        for (BasicShape bs : shapes){
            s.append(bs.toString()).append("\n");
        }
        s.append("****************");
        return s.toString();
    }
}
