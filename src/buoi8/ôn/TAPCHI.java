package buoi8.ôn;

import java.util.Scanner;

public class TAPCHI extends THUVIEN{
    private int soPH;
    private int thangPH;

    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số phát hành:");
        soPH=sc.nextInt();
        System.out.println("nhập tháng phát hành:");
        thangPH=sc.nextInt();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TAPCHI{" +super.toString()+
                "soPH=" + soPH +
                ", thangPH=" + thangPH +
                '}';
    }
    public TAPCHI(){
    }

}
