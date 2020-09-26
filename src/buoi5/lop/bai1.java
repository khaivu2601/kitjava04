package buoi5.lop;

import java.util.Scanner;

public class bai1 {
    String hoTen;
    String queQuan;
    String gioiTinh;
    String maLop;
    String nganhHoc;
    int khoahoa;
    String khoa;
    String monHoc;
    int namKinhn;
    int namSinh;
    void nhaphocvien(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập họ tên ");
        hoTen=sc.nextLine();
        System.out.println("bajnn đến từ ");
        queQuan=sc.nextLine();
        System.out.println("bạn có bđ ko?");
        gioiTinh=sc.nextLine();
        System.out.println("mã lớp học ");
        maLop=sc.nextLine();
        System.out.println("học ngành gì ?");
        nganhHoc=sc.nextLine();
        System.out.println("học khóa bao nhiêu ku ?");
        khoahoa=sc.nextInt();

    }
    void nhapGiangvien(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập họ tên ");
        hoTen=sc.nextLine();
        System.out.println("bajnn đến từ ");
        queQuan=sc.nextLine();
        System.out.println("nhập giới tính ");
        gioiTinh=sc.nextLine();
        System.out.println("thuộc khoa nào");
        khoa=sc.nextLine();
        System.out.println("dạy môn gì ?");
        monHoc=sc.nextLine();
        System.out.println("năm kinh nghiệm");
        namKinhn=sc.nextInt();
    }
    void inHocvien(){
        System.out.println(hoTen);
        System.out.println(queQuan);
        System.out.println(gioiTinh);
        System.out.println(maLop);
        System.out.println(nganhHoc);
        System.out.println(khoahoa);
    }
    void inGiangvien(){
        System.out.println(hoTen);
        System.out.println(queQuan);
        System.out.println(gioiTinh);
        System.out.println(khoa);
        System.out.println(monHoc);
        System.out.println(namKinhn);
    }
}
