package ex4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Cron {

    private final int NUM_ACTIONS = 10;

    private List<DateAction> actions = new ArrayList<>();

    public void addDateAction(DateAction da){
        Date now = new Date();
        if(actions.size() < NUM_ACTIONS && da.getDate().after(now))
            actions.add(da);
    }

    public void start(){
        boolean ended = false;
        while (!ended){
            for(DateAction da : actions){
                Date now = new Date();
                if (da.getDate().before(now) && !da.isDone()){
                    da.getAction().execute();
                    da.setDone(true);
                }
            }

            ended = true;
            for(DateAction da : actions){
                if (!da.isDone()){
                    ended = false;
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());

        c.add(Calendar.SECOND, 2);
        Date d1 = c.getTime();

        c.add(Calendar.SECOND, 2);
        Date d2 = c.getTime();

        c.add(Calendar.SECOND, 2);
        Date d3 = c.getTime();

        Cron cron = new Cron();
        cron.addDateAction(new DateAction(d1,
                new PrintAction("Action 1")));
        cron.addDateAction(new DateAction(d2,
                new PrintAction("Action 2")));
        cron.addDateAction(new DateAction(d3,
                new PrintAction("Action 3")));
        cron.addDateAction(new DateAction(d3, new Action() {
            @Override
            public void execute() {
                for(int i = 0; i < 10; i++){
                    System.out.println(i);
                }
            }
        }));

        cron.start();

    }

}
