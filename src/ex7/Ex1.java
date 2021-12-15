package ex7;

public class Ex1 {

    /*
        @requires s != null && a != null
        @ensures a.isIn(s) &&
            (\forall Student t; !s.equals(t); a.isIn(t) <=> \old(a.isIn(t)))
            && \result <=> !\old(a.isIn(t))
     */
    public static boolean addStudent(Student s, Room a){
        // TO BE IMPLEMENTED
        return true;
    }

    static class Student {
        // TO BE IMPLEMENTED
    }

    static class Room {
        // TO BE IMPLEMENTED
        public boolean isIn(Student s){
            // TO BE IMPLEMENTED
            return true;
        }
    }
}
