package ex6;

public class Valve implements Runnable {

    public enum State {
        OPENED, CLOSED
    }

    private State state;

    public Valve(){
        state = State.CLOSED;
    }

    public State getState() {
        return state;
    }

    @Override
    public void run() {
        System.out.println("Opening...");
        double time = 8 * Math.random();
        try {
            Thread.sleep((long) (1000*time));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this){
            state = State.OPENED;
            notify();
        }

        System.out.println("Valve opened after "+time+" seconds");

        time = 5 + 5 * Math.random();

        try {
            Thread.sleep((long) (1000 * time));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        state = State.CLOSED;

        System.out.println("Valve is now closed");

    }


}
