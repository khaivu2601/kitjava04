package buoi5.nha;

import java.util.Scanner;

public class Tapchi extends chung{
    private String maTL;
    private String tenTL;

    public void nhap(){
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println("nhập mã tài liệu");
        maTL=sc.nextLine();
        System.out.println("tên tài liệu");
        tenTL=sc.nextLine();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Tapchi{" +
                super.toString()+
                "maTL='" + maTL + '\'' +
                ", tenTL='" + tenTL + '\'' +
                '}';
    }
    public Tapchi(){

    }
}
