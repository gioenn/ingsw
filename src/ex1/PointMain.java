package ex1;

public class PointMain {

    public static void main(String[] args){

        Point p0 = new Point(0.0f, 0.0f);
        Point p1 = new Point(2.0f, 2.0f);
        double d = p0.getDistance(p1);
        //double d1 = Point.distance(p0, p1);
        Polygon square = new Polygon(4);
        square.setVertex(0, new Point(0.0f, 0.0f));
        square.setVertex(1, new Point(0.0f, 1.0f));
        square.setVertex(2, new Point(1.0f, 1.0f));
        square.setVertex(3, new Point(1.0f, 0.0f));

        float perimeter = square.getPerimeter();

        System.out.println(perimeter);
    }
}
