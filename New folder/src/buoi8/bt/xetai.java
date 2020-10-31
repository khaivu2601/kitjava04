package buoi8.bt;

import java.util.Scanner;

public class xetai extends HangXe{
    private int taiTrong;

    public xetai(){
    }
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tải trọng xe :");
        taiTrong=sc.nextInt();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "xetai{" +
                super.toString() +
                "taiTrong=" + taiTrong +
                '}';
    }
}
