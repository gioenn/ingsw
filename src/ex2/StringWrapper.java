package ex2;

public class StringWrapper {

    private String data;

    public StringWrapper(String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String newData){
        data = newData;
    }

    public static void main(String[] args){
        StringWrapper sw1 = new StringWrapper("ABC");
        StringWrapper sw2 = sw1;
        sw2.setData("DEF");
        System.out.println(sw1.getData());
    }
}
