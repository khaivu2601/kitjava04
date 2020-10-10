package buoi6;

import java.util.Scanner;

public class TreEm  extends DOCGIA{
    private String nguoiDaidien;
    public int tinhTien(){
        return thangDki*5000;
    }
    void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tên người giám hộ :");
        nguoiDaidien=sc.nextLine();
    }
    void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TreEm{" +
                super.toString() +
                "nguoiDaidien='" + nguoiDaidien + '\'' +
                '}';
    }
    public TreEm(){

    }

    public String getNguoiDaidien() {
        return nguoiDaidien;
    }

    public void setNguoiDaidien(String nguoiDaidien) {
        this.nguoiDaidien = nguoiDaidien;
    }
}
