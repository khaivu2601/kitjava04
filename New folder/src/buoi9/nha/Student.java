package buoi9.nha;

public class Student extends Person{
    private String gvcn;
    public Student(String name, String address, String departmen,String gvcn) {
        super(name, address, departmen);
        this.gvcn=gvcn;
    }

    public Student() {
        super();
    }

    @Override
    public void xuat() {
        System.out.println("học sinh name : " +getName());
        System.out.println("học sinh address : "+getAddress());
        System.out.println("học sinh departmen :"+getDepartmen());
        System.out.println("gvcn "+gvcn);
    }
}
