package ex2;

import java.util.Date;

public class Person implements Comparable<Person> {

    private String name, surname;
    private Date birthday;

    public Person(String name, String surname, Date birthday){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }


    @Override
    public int compareTo(Person o) {
        int c1 = surname.compareTo(o.surname);
        int c2 = name.compareTo(o.name);
        if (c1 > 0 || (c1 == 0 && c2 > 0))
            return 1;
        else if (c1 == 0 && c2 == 0)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return surname;
    }
}
