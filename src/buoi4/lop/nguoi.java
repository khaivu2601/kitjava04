package buoi4.lop;

import java.util.Scanner;

public class nguoi {
    String ten;
    int tuoi;
    String quoctich;

    void nhapnguoi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap tên ");
        ten=sc.nextLine();
        System.out.println("nhập tuổi");
        tuoi=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập quốc tịch");
        quoctich=sc.nextLine();
    }
    void in(){
        System.out.println(ten);
        System.out.println(tuoi);
        System.out.println(quoctich);
    }
}
