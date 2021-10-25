package ex4;

public class Father extends Person {

    int x;

    public Father(int x){
        this.x = x;
    }

    public int m(Father f){
        return f.x - x;
    }

}
