package buoi9.nha.b1;

public class cat extends animal{

    public cat(String name ){
        super(name);
    }
    @Override
    protected void makeAsound() {
        System.out.println("kêu : mèo méo meo mèo meo");
        System.out.println("tên :"+ getName());
    }
}
