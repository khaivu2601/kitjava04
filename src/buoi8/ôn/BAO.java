package buoi8.ôn;

import java.util.Scanner;

public class BAO extends THUVIEN{
    private int ngayPH;

    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập ngày phát hành :");
        ngayPH=sc.nextInt();
    }
    public BAO(){

}
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BAO{" +
                super.toString()+
                "ngayPH=" + ngayPH +
                '}';
    }
}
