package buoi8.ôn;

import java.util.Scanner;

public class THUVIEN {
    private String MaTL;
    private String tenNxb;
    private int soPhathanh;

    public void nhap() {
        System.out.println("nhập mã tài liệu :");
        Scanner sc = new Scanner(System.in);
        MaTL = sc.nextLine();
        System.out.println("nhập tên nhà xuất bản :");
        tenNxb = sc.nextLine();
        System.out.println("nhập số hiệu xuất bản :");
        soPhathanh = sc.nextInt();
    }
    public THUVIEN(){}

    public void xuat() {

    }

    @Override
    public String toString() {
        return "THUVIEN{" +
                "MaTL='" + MaTL + '\'' +
                ", tenNxb='" + tenNxb + '\'' +
                ", soPhathanh=" + soPhathanh +
                '}';
    }
}
