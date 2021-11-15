package ex5;

public class Pot {

    private final int P = 40;
    private int parts = P;

    public synchronized void getPart(String camperName){
        while(parts == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        parts--;
        notifyAll();

        System.out.println(camperName + " ha ottenuto una razione. Parti rimanenti: "+parts);


    }

    public synchronized void fill(){
        System.out.println("Chef fill start");
        while (parts > 0){
            System.out.println("Aspettando che la pentola si svuoti");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        parts = P;
        notifyAll();
        System.out.println("Chef fill end");
    }

    public static void main(String[] args){
        Pot pot = new Pot();
        new Thread(new Chef(pot)).start();
        new Thread(new Camper(pot,"A")).start();
        new Thread(new Camper(pot,"B")).start();
        new Thread(new Camper(pot,"C")).start();
        new Thread(new Camper(pot,"D")).start();
        new Thread(new Camper(pot,"E")).start();
        new Thread(new Camper(pot,"F")).start();
        new Thread(new Camper(pot,"G")).start();
        new Thread(new Camper(pot,"H")).start();
        new Thread(new Camper(pot,"I")).start();

    }
}
