package buoi8.ôn;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<QuanLy> QLTV = new ArrayList<>();
    Scanner sc= new Scanner(System.in);

    public  QuanLy(){

    }
    public void Main(){
        System.out.println("\t\tQUAN LI TAI LIEU");
        System.out.println("1. Nhập thông tin về các tài liệu\n" +
                           "2. Hiển thị thông tin về các tài liệu\n" +
                           "3. Xuất ra màn hình tài liệu theo loại ");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }

    public void nhap(){
        System.out.println("nhập loại hình (sach/bao/tapchi)");
        String loai = sc.nextLine().toLowerCase();
        QuanLy tmp = null;
        switch (loai)
        {
            case "sach" : tmp= new SACH();break;
            case "bao" : tmp = new BAO();break;
            case "tapchi" : tmp = new TAPCHI();break;
            default:
                System.out.println("nhìn kia r nhập :");
        }
        tmp.nhap();
        QLTV.add(tmp);
    }

    public void xuatToanBo(){
        System.out.println("danh sách thông tin :");
        for (int i = 0; i < QLTV.size(); i++) {
            QLTV.get(i).xuat();
        }
    }
    public void xuatTungPhan(){

    }
}
