package ex4;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T>  {

    private LinkedList<T> data = new LinkedList<>();
    private int size;

    public Stack(int size){
        this.size = size;
    }

    public void push(T elem) throws OutOfSpaceException{
        if (data.size() >= size)
            throw new OutOfSpaceException();
        data.addFirst(elem);
    }

    public T pop() throws OutOfDataException {
        if (data.size() <= 0)
            throw new OutOfDataException();
        return data.removeFirst();
    }

    public static void main(String[] args) throws OutOfDataException {
        Stack<String> s1 = new Stack<String>(2);
        s1.push("1");
        s1.push("2");
        s1.push("3");
        String s = s1.pop();
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }


    private class StackIterator implements Iterator<T>{
        private int idx = 0;

        @Override
        public boolean hasNext() {
            return idx < data.size();
        }

        @Override
        public T next() {
            return data.get(idx++);
        }
    }

}
