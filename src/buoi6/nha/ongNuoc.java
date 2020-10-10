package buoi6.nha;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class ongNuoc extends chung{
    private int soGiosua;
    public int tinhTien(){
        return soGiosua*50000;
    }
    void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số giờ sửa :");
        soGiosua=sc.nextInt();
    }
    void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ongNuoc{" +
                super.toString() +
                "soGiosua=" + soGiosua +
                '}';
    }
    public ongNuoc(){

    }

    public int getSoGiosua() {
        return soGiosua;
    }

    public void setSoGiosua(int soGiosua) {
        this.soGiosua = soGiosua;
    }
}
