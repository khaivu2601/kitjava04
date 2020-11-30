/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class ThiSinh {
    private String hoten;
    private String ngaysinh;
    private String diachi;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("nhập họ tên");
        hoten=sc.nextLine();
        System.out.println("nhập ngày sinh");
        ngaysinh=sc.nextLine();
        System.out.println("nhập địa chỉ");
        diachi=sc.nextLine();
    }
public double tongdiem(){
    return 0;
}
    @Override
    public String toString() {
        return  "hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi + '}';
    }
public void xuat(){
    System.out.println(toString());
}
    public ThiSinh() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
    
}
