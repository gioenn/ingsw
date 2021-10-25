package ex3;

public class Square extends Polygon {

    public float edge;

    public Square(float edge){
        this.edge = edge;
        name = "square";
    }

    @Override
    public float getPerimeter() {
        return edge*4;
    }
}
