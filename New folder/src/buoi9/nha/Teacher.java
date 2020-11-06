package buoi9.nha;

public class Teacher extends Person{
    private String rank;
    public Teacher(String name,String address,String departmen,String rank){
        super(name,address,departmen);
        this.rank=rank;
    }
    @Override
    public void xuat() {
        System.out.println("teacher name : " +getName());
        System.out.println("teacher address : "+getAddress());
        System.out.println("teacher departmen :"+getDepartmen());
        System.out.println("teacher rank :"+rank);
    }
}
