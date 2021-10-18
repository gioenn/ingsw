package ex3;

public class Square extends Polygon {

    private float edge;

    public Square(float edge){
        this.edge = edge;
    }

    @Override
    public float getPerimeter() {
        return edge*4;
    }
}
