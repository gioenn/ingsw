package ex3;

import java.util.ArrayList;
import java.util.List;

abstract public class Polygon {

    public abstract float getPerimeter();

    public static void printPolygons(List<Polygon> polygons){
        for (Polygon p : polygons)
            System.out.println(p.getPerimeter());
    }

    public static void main(String[] args){
        Square s = new Square(4.0f);
        Triangle t = new Triangle(1.0f, 2.0f, 3.0f);
        
        List<Polygon> data = new ArrayList<>();
        data.add(s);
        data.add(t);
        printPolygons(data);
    }
}
