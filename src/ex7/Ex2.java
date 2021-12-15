package ex7;

public class Ex2 {
    public static int count = 0;

    /*
       @requires y != null && z != null && 0 <= x < z.length - 1
       @ensures \result == \old(x) + 1 &&
                    z[\result] == z[\result-1] + 1 &&
                    count == \old(count) + 1
       @assignable z[\result]
     */
    public static int foo(int x, String y, int[] z) {
        System.out.println(count);
        System.out.println(y + z[x]);
        x++;
        z[x] = z[x-1] + 1;
        count++;
        return x;
    }
}
