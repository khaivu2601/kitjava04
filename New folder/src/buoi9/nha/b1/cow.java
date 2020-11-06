package buoi9.nha.b1;

public class cow extends animal{
    public cow(String name) {
        super(name);
    }

    @Override
    protected void makeAsound() {
        System.out.println("kêu : ò ò ò");
        System.out.println("tên "+getName());
    }
}
