package ex3;

import ex2.Person;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static <T> Comparable<T> min(List<Comparable<T>> data){
        Comparable res = null;
        for (Comparable elem : data){
            if (res == null || elem.compareTo(res) < 0) {
                res = elem;
            }
        }
        return res;
    }

    public static void main(String[] args){
        List<Comparable<Person>> persons = new ArrayList<>();
        persons.add(new Person("B", "B", null));
        persons.add(new Person("A", "A", null));

        Comparable<Person> res = min(persons);

        System.out.println(res);

    }
}
