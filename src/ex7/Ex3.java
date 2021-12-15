package ex7;

public class Ex3 {
    private float low, high;
    public float getLowerBound(){ return low; }
    public float getUpperBound(){ return high; }

    /*
        @requires times != null &&
                (\forall int i; 0 <= i < times.length - 1; times[i] < times[i+1])
                 && times.length >= 2 && timePoint >= times[0]
                 && timePoint < times[times.length - 1]
        @ensures (\exists int f; 0 <= f < times.length - 1;
                   times[f] == \result.getLowerBound() &&
                   times[f+1] == \result.getUpperBound()) &&
                   timePoint >= \result.getLowerBound() &&
                   timePoint < \result.getUpperBound()
        @assignable \nothing
     */
    public static Interval getInterval(float[] times, float timePoint){
        return null;
    }

    static class Interval {}
}
