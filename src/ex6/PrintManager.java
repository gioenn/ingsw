package ex6;

public class PrintManager {

    private static PrintManager instance = new PrintManager();

    private PrintManager(){ }

    public static PrintManager getInstance(){
        return instance;
    }

}
