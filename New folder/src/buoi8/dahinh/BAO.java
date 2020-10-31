package buoi8.dahinh;

import java.util.Scanner;

public class BAO extends ThuVien{
    private String ngayPhatHanh;

    public BAO() {

    }
    public void nhapTT()
    {
        super.nhapTT();
        System.out.println("Nhập ngày phát hành: ");
        ngayPhatHanh = new Scanner(System.in).nextLine();
    }
    public void xuatTT()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BAO{" +
                super.toString()+
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }
}
