package buoi9.nha.b1;

public class dog extends animal{


    public dog(String name) {
        super(name);
    }

    @Override
    protected void makeAsound() {
        System.out.println("kêu : go go go");
        System.out.println("tên " + getName());
    }
}
