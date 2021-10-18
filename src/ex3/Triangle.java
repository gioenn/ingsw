package ex3;

public class Triangle extends Polygon {

    float edge1, edge2, edge3;

    public Triangle(float edge1, float edge2, float edge3){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;

    }
    @Override
    public float getPerimeter() {
        return edge1+edge2+edge3;
    }
}
