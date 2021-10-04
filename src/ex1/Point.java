package ex1;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public double getDistance(Point p){
        double dx = Math.pow(x - p.x, 2);
        double dy = Math.pow(y - p.y, 2);
        return Math.sqrt(dx + dy);
    }

    /*
    public static double distance(Point p1, Point p2){
        double dx = Math.pow(p1.x - p2.x, 2);
        double dy = Math.pow(p1.y - p2.y, 2);
        return Math.sqrt(dx + dy);
    }
    */
}
