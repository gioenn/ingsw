package ex1;

public class Set {
    private int values[];
    private int currentSize;

    public Set(int size){
        currentSize = 0;
        values = new int[size];
        // logic
    }

    public Set(){
        this(100);
    }

    public boolean isMember(int n){
        int i = 0;
        while(i < currentSize){
            if(values[i] == n){
                return true;
            }
        }
        return false;
    }

    public void add(int n){
        if(isMember(n) || currentSize == values.length)
            return;
        values[currentSize] = n;
        currentSize++;
    }

    public void deleteMember(int n){
        int i = 0;
        while(i < currentSize){
            if(values[i]==n){
                currentSize--;
                while(i < currentSize)
                {
                    values[i] = values[i+1];
                    i++;
                }
            }
        }

    }



}
