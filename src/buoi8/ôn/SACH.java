package buoi8.ôn;

import buoi5.nha.Sach;

import java.util.Scanner;

public class SACH extends THUVIEN {
    private String tenTG;
    private int soTrang;

    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tên tác giả :");
        tenTG=sc.nextLine();
        System.out.println("nhập số trang :");
        soTrang=sc.nextInt();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SACH{" +
                super.toString()+
                "tenTG='" + tenTG + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }

    public SACH(){
    }
}
