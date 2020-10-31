package buoi8.dahinh;

import java.util.Scanner;

public class TAPCHI extends ThuVien{
    private String soPhatHanh;
    private int thangPhatHanh;

    public void nhapTT()
    {
        super.nhapTT();
        System.out.println("Nhập soPhatHanh: ");
        soPhatHanh = new Scanner(System.in).nextLine();
        System.out.println("Nhập thangPhatHanh: ");
        thangPhatHanh = new Scanner(System.in).nextInt();

    }
    public TAPCHI() {
    }

    public void xuatTT()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TAPCHI{" +
                super.toString()+
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
