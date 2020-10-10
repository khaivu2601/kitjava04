package buoi5.lop;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private int namSinh;
    void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập họ tên ");
        hoTen=sc.nextLine();
        System.out.println("nhập gới tính ");
        gioiTinh=sc.nextLine();
        System.out.println("nhập quê quán");
        queQuan=sc.nextLine();
        System.out.println("nhập năm sinh ");
        namSinh=sc.nextInt();
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}
