package buoi5.nha;

import java.util.Scanner;

public class Sach extends chung{
    private String tenSach;
    private int soLantb;
    private String danhMuc;

    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập dnah mục");
        danhMuc=sc.nextLine();
        System.out.println("nhập tên sách ");
        tenSach=sc.nextLine();
        System.out.println("nhập số lần tái bản");
        soLantb=sc.nextInt();
    }
    public void sosanh(Tapchi tc){
        if(this.getNhaXb().equalsIgnoreCase(tc.getNhaXb()))
        {
            System.out.println("chung nhaf xuaats ban");
        }
        else
            System.out.println("ko chung");
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sach{" +
                super.toString()+
                "tenSach='" + tenSach + '\'' +
                ", soLantb=" + soLantb +
                ", danhMuc='" + danhMuc + '\'' +
                '}';
    }
    public Sach(){

    }
}
