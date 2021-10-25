package ex4;

public class PrintAction implements Action {

    public String message;

    public PrintAction(String message){
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}
