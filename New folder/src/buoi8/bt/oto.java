package buoi8.bt;

import java.util.Scanner;

public class oto extends HangXe{
    private String kieuDongco;
    private int soGhe;

    public oto(){
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("nhập kiểu động cơ :");
        kieuDongco=sc.nextLine();
        System.out.println("nhập số chỗ ngồi :");
        soGhe=sc.nextInt();

    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "oto{" +
                super.toString() +
                "kieuDongco='" + kieuDongco + '\'' +
                ", soGhe=" + soGhe +
                '}';
    }
}
