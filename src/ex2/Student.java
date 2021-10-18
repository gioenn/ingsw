package ex2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person {

    private static int idGen = 0;
    private static final int GRADUATION_CREDITS = 180;
    private int id;
    private List<Grade> grades;

    public Student(String name, String surname, Date date){
        super(name, surname, date);
        id = idGen++;
        grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getTotalCredits(){
        int credits = 0;
       /* for (int i = 0; i < grades.size(); i++){
            Grade g = grades.get(i); */
        for (Grade g : grades) {
            credits += g.getCredits();
        }
        return credits;
    }

    public boolean canGraduate(){
        /*
        int credits = getTotalCredits();
        if (credits >= GRADUATION_CREDITS)
            return true;
        else return false;
         */
        return getTotalCredits() >= GRADUATION_CREDITS;
    }

    public double getWeightedAverage(){
        double res = 0;
        for (Grade g : grades){
            res += g.getCredits()*g.getPoints();
        }
        return res / getTotalCredits();
    }

    @Override
    public int compareTo(Person o) {
        int c = super.compareTo(o);
        if (c == 0 && o instanceof Student){
            Student s = (Student) o;
            Integer sId = s.id;
            return sId.compareTo(id);
        }
        return c;
    }

    public static void main(String[] args){
        Student first = new Student(
                "Mario",
                "Rossi",
                new Date());
        String name = first.getName();
    }
}
