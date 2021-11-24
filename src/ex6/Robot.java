package ex6;

public class Robot {

    Behavior behavior;

    public void setBehavior(Behavior behavior){
        this.behavior = behavior;
    }

    public void move(){
        // ...
        behavior.apply(this);
        // ...
    }
}
