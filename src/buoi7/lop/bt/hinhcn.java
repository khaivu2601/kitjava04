package buoi7.lop.bt;

import java.util.Scanner;

public class hinhcn extends hinh{
    private int chieuDai;
    private int chieuRong;
    void nhap(){
        System.out.println("nhập chiều dài hcn :");
        Scanner sc=new Scanner(System.in);
        chieuDai=sc.nextInt();
        System.out.println("nhập chiều rộng :");
        chieuRong=sc.nextInt();
    }


    void tinhDientich() {
        System.out.println("diện tích hcn là :"+(chieuRong*chieuDai));
    }
}
