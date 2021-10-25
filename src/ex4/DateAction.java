package ex4;

import java.util.Date;

public class DateAction {

    private Action action;
    private Date date;


    private boolean done;

    public DateAction(Date date, Action action){
        this.date = date;
        this.action = action;
        this.done = false;
    }

    public Action getAction() {
        return action;
    }

    public Date getDate() {
        return date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


}
