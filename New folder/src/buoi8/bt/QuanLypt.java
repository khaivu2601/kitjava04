package buoi8.bt;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLypt {
    ArrayList<HangXe> Lexus = new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public void Menu(){
        System.out.println("\t\tquản lý phương tiện ");
        System.out.println("1. Nhập thông tin về các phương tiện\n" +
                "2. Hiển thị thông tin về các phương tiện\n" +
                "3. Xuất ra màn hình phương tiện theo loại \n"+
                "4. Tìm màu phương tiện ");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }

    public QuanLypt(){
    }

    public void nhap(){
        System.out.println("nhập thông tin phương tiện (oto/xemay/xetai)");
        String pick=sc.nextLine();
        HangXe tmp =null;
        switch (pick)
        {
            case "oto":tmp= new oto();break;
            case "xemay":tmp=new xemay();break;
            case "xetai":tmp =new xetai();break;
            default:
                System.out.println("chọn lại");
        }
       tmp.nhap();
        Lexus.add(tmp);
    }

    public void xuattb(){
        for (int i = 0; i < Lexus.size(); i++) {
            Lexus.get(i).xuat();
        }
    }

    public void xuatTheoloai(){
        System.out.println("nhập loại phương tiện muốn ktra (oto/xemay/xetai)");
        String loai=sc.nextLine().toLowerCase();
        if(loai.equalsIgnoreCase("oto")){
            for (int i = 0; i < Lexus.size(); i++) {
                if(Lexus.get(i) instanceof oto == true){
                    Lexus.get(i).xuat();
                }
            }
        }
        else
        if(loai.equalsIgnoreCase("xemay")){
            for (int i = 0; i < Lexus.size(); i++) {
                if(Lexus.get(i) instanceof xemay == true){
                   Lexus.get(i).xuat();
                }
            }
        }
        else
        if(loai.equalsIgnoreCase("xetai")){
            for (int i = 0; i < Lexus.size(); i++) {
                if(Lexus.get(i) instanceof xetai == true){
                  Lexus.get(i).xuat();                }
            }
        }
    }
    public void TimPT(){
        String tim="";
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập màu phương tiện :");
        tim=sc.nextLine();
        int i=0;
        for (HangXe tmp:Lexus){
            if(tim.equalsIgnoreCase(Lexus.get(i).mau)){
                Lexus.get(i).xuat();
            }
            i++;
        }
    }
}
