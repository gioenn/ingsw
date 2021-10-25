package ex4;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){
        Father f1 = new Father(100);
        Father f2 = new Son(100, 1);
        Son s1 = new Son(100, 2);
        Person p1 = new Son(100, 3);
        System.out.println(f2.m(f1));

        System.out.println(p1.m(s1));

        Stack<String> stack1 = new Stack<String>(5);
        stack1.push("1");
        stack1.push("2");
        stack1.push("3");
        Iterator<String> it = stack1.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        for (String s : stack1)
            System.out.println(s);


    }
}
