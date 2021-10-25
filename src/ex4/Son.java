package ex4;

public class Son extends Father {

    int y;

    public Son(int x, int y){
        super(x);
        this.y = y;
    }

    public int m(Person f){
        return 100;
    }

    public int m(Son f){
        return f.y - y;
    }


}
