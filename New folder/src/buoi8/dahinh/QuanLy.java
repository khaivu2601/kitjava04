package buoi8.dahinh;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<ThuVien> TV=new ArrayList<>();
    Scanner sc= new Scanner(System.in);

    public void Menu(){
        System.out.println("\t\tQUAN LI TAI LIEU");
        System.out.println("1. Nhập thông tin về các tài liệu\n" +
                           "2. Hiển thị thông tin về các tài liệu\n" +
                           "3. Xuất ra màn hình tài liệu theo loại ");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }
    public QuanLy(){
    }
    public void nhap(){
        System.out.println("nhập thông tin tài liệu (bao/sach/tapchi)");
        String loai=sc.nextLine();
        ThuVien tmp=null;
        switch (loai)

        {
            case "sach" :tmp= new SACH();break;
            case "bao" :tmp=new BAO();break;
            case "tapchi":tmp=new TAPCHI();break;
            default:
                System.out.println("nhìn lại r chọn @.@ ");

        }
        tmp.nhapTT();
        TV.add(tmp);
    }
    public void xuatTb(){
        for (int i = 0; i < TV.size(); i++) {
            TV.get(i).xuatTT();
        }
    }
    public void xuatTp(){
        System.out.println("nhập loại tài liệu (bao/sach/tapchi)");
        String loai=sc.nextLine().toLowerCase();
        if(loai.equalsIgnoreCase("bao"))
        {
            for (int i = 0; i < TV.size(); i++)
            {
                if(TV.get(i) instanceof BAO == true){
                    TV.get(i).xuatTT();
                }

            }
        }
        else
        if(loai.equalsIgnoreCase("sach"))
        {
            for (int i = 0; i < TV.size(); i++)
            {
                if(TV.get(i) instanceof SACH == true){
                    TV.get(i).xuatTT();
                }

            }
        }
        else
        if(loai.equalsIgnoreCase("tapchi"))
        {
            for (int i = 0; i < TV.size(); i++)
            {
                if(TV.get(i) instanceof TAPCHI == true){
                    TV.get(i).xuatTT();
                }

            }
        }
    }
}
