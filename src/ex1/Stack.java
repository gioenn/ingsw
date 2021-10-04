package ex1;

public class Stack {
    private static final int DEFAULT_SIZE = 10;
    private int data[];
    public int cur;

    public Stack(int size){
        cur = 0;
        data = new int[size];
    }

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public void push(int n){
        if (cur < data.length){
            data[cur++] = n;
        }
    }

    public Integer pop(){
        if (cur > 0) {
            return data[--cur];
        }
        return null;
    }
    
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        int n = s.pop();
    }
}
