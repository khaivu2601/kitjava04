package buoi7.lop.bt;

import java.util.Scanner;

public class hinhTron extends hinh {
    Float banKinh;
    void nhap(){
        System.out.println("nhập bán kính :");
        Scanner sc=new Scanner(System.in);
        banKinh=sc.nextFloat();
    }
    void tinhDientich() {
        double dienTich;
        dienTich=3.14*banKinh*banKinh;
        System.out.println("diện tích hình tròn là : " +dienTich);
    }
}
