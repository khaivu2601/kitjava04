package buoi8.bt;

import java.util.Scanner;

public class HangXe {
    protected String hangSX;
    protected int namSx;
    protected String mau;
    protected int giaBan;

    public HangXe(){

    }

    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập hãng sản xuất :");
        hangSX=sc.nextLine();
        System.out.println("nhập màu  sản xuất :");
        mau =sc.nextLine();
        System.out.println("nhập năm sản xuất :");
        namSx=sc.nextInt();
        System.out.println("nhập giá bán lẻ :");
        giaBan=sc.nextInt();
    }
    public void xuat(){

    }

    @Override
    public String toString() {
        return "HangXe{" +
                "hangSX='" + hangSX + '\'' +
                ", namSx=" + namSx +
                ", mau='" + mau + '\'' +
                ", giaBan=" + giaBan +
                '}';
    }
}
