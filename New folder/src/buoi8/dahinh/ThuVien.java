package buoi8.dahinh;

import java.util.Scanner;

public class ThuVien {
    protected String maTaiLieu;
    protected String nhaXB;
    protected String soBanPhatHanh;

    public ThuVien() {
    }

    public void nhapTT()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập maTaiLieu");
        maTaiLieu= sc.nextLine();
        System.out.println("Nhập nhaXB");
        nhaXB= sc.nextLine();
        System.out.println("Nhập soBanPhatHanh");
        soBanPhatHanh= sc.nextLine();
    }
    public void xuatTT() {
        }

    @Override
    public String toString() {
        return "ThuVien{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXB='" + nhaXB + '\'' +
                ", soBanPhatHanh='" + soBanPhatHanh + '\'' +
                '}';
    }
}