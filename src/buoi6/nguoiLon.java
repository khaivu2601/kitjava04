package buoi6;

import java.util.Scanner;

public class nguoiLon extends DOCGIA{
    private int soCMND;
    public int Tinhtien(){
        return thangDki*10000;
    }
    void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số cmnd :");
        soCMND=sc.nextInt();
    }
    void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "nguoiLon{" +
                super.toString() +
                "soCMND=" + soCMND +
                '}';
    }
    public nguoiLon(){}

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }
}
