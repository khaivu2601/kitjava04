package buoi9.nha.b1;

import java.util.Scanner;

public abstract class animal {
    private String name;

    public void name(){
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
    }
    public animal(String name){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void introduce(){
        makeAsound();
    }

    protected abstract void makeAsound();
}
