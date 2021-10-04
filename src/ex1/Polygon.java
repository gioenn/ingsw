package ex1;

public class Polygon {

    private Point[] vertices;

    public Polygon(int numVertices){
        vertices = new Point[numVertices];
    }

    public void setVertex(int i, Point p){
        vertices[i] = p;
    }

    public float getPerimeter(){
        float p = 0;

        for(int i = 0 ; i < vertices.length - 1; i++)
            p += vertices[i].getDistance(vertices[i+1]);

        p += vertices[vertices.length-1].getDistance(vertices[0]);

        return p;
    }

}
