package buoi8.dahinh;

import java.util.Scanner;

public class SACH extends ThuVien{
    private String tenTacGia;
    private int soTrang;


    public SACH() {
    }


    public void nhapTT()
    {
        super.nhapTT();
        System.out.println("Nhập tenTacGia: ");
        tenTacGia = new Scanner(System.in).nextLine();
        System.out.println("Nhập soTrang: ");
        soTrang = new Scanner(System.in).nextInt();

    }
    public void xuatTT()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SACH{" +
                super.toString()+
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
