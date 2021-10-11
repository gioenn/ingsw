package ex2;

import java.util.Date;

public class C2 extends C1 {

    @Override
    protected void m2(){
        System.out.println("C2-m2");
    }


    public static void main(String[] args){
        C2 example = new C2();
        example.m1();
        Object o = example;
        // ERROR: o.m1();

        Student s1 = new Student("Mario", "Rossi", new Date());
        printPerson(s1);

        Person p1 = s1;
    }

    public static void printPerson(Person p){
        System.out.println(p.getName()+" "+p.getSurname()+", "+p.getBirthday());
    }
}
