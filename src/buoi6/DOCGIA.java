package buoi6;

import java.util.Scanner;

public class DOCGIA {
    protected String hoTen;
    protected String ngayLAPthe;
    protected int thangDki;
    void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "DOCGIA{" +
                "hoTen='" + hoTen + '\'' +
                ", ngayLAPthe='" + ngayLAPthe + '\'' +
                ", thangDki=" + thangDki +
                '}';
    }
    void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập họ tên :");
        hoTen=sc.nextLine();
        System.out.println("nhập ngày tham gia :");
        ngayLAPthe=sc.nextLine();
        System.out.println("nhập HSD :");
        thangDki=sc.nextInt();
    }
    public DOCGIA(){

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayLAPthe() {
        return ngayLAPthe;
    }

    public void setNgayLAPthe(String ngayLAPthe) {
        this.ngayLAPthe = ngayLAPthe;
    }

    public int getThangDki() {
        return thangDki;
    }

    public void setThangDki(int thangDki) {
        this.thangDki = thangDki;
    }
}
