package paint.shapes;

public class GeneralShape {
    final String name;


    public GeneralShape(String n){
        this.name = n;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
