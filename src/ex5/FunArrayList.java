package ex5;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunArrayList<A> extends ArrayList<A>{

    public <B> FunArrayList<B> map(Function<A, B> f){
        FunArrayList<B> res = new FunArrayList<>();
        for(A elem : this){
            res.add(f.apply(elem)); // f(elem)
        }
        return res;
    }


    public FunArrayList<A> filter(Predicate<A> f){
        FunArrayList<A> res = new FunArrayList<>();
        for(A elem : this){
            if (f.test(elem))
                res.add(elem);
        }
        return res;
    }

    public <B> B reduce(B initial, BiFunction<B, A, B> f){
        B res = initial;
        for (A elem : this)
            res = f.apply(res, elem);
        return res;
    }

    public static void main(String[] args){

        var a = new FunArrayList<String>();
        a.add("ABC");
        a.add("D");
        a.add("FGHI");

        var r = a.map(a::lengthSquare);
        var q = a.filter((y) -> y.charAt(0) > 'C');
        var w = a.reduce(0, (y, z) -> y + z.length());
        System.out.println(r);
        System.out.println(q);
        System.out.println(w);

    }

    public int lengthSquare(String s){
        return s.length() * s.length();
    }


}
