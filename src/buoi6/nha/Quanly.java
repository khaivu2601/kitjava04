package buoi6.nha;

import buoi6.TreEm;
import buoi6.nguoiLon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Quanly {
    ArrayList<ongNuoc> ongNuoclist;
    ArrayList<Shipper> Shipperlist;
    ArrayList<Grab> Grablist;
    public void Menu(){
        System.out.println("\t \t \t Quản lý hệ thống ");
        System.out.println("1.Nhập thợ sửa ống nước");
        System.out.println("2.Xuất thhowj sửa ống nước");
        System.out.println("3.nhập shipper");
        System.out.println("4.Xuất shipper");
        System.out.println("5.nhập grab");
        System.out.println("6.Xuất grab");
        System.out.println("7.tính tiền ");
        System.out.println("0.exit");
        System.out.println("Mời bạn chọn ");
    }
    public Quanly(){
        ongNuoclist = new ArrayList<>();
        Shipperlist =new ArrayList<>();
        Grablist =new ArrayList<>();
    }
    public void nhapongNuoc(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số thợ sửa ống nc: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("NHAP thợ thứ " + (i + 1));
            ongNuoc tmp = new ongNuoc();
            tmp.nhap();
            ongNuoclist.add(tmp);

        }
    }
    public void xuatongNuoc(){
        System.out.println("\t\t\t danh sách thợ là : ");
        for (int i = 0; i < ongNuoclist.size(); i++) {
            System.out.print((i+1)+ ". ");
            ongNuoclist.get(i).xuat();

        }
    }
    public void nhapShipper(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số shipper :");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập shipper thứ "+ (i+1));
            Shipper tmp =new Shipper();
            tmp.nhap();
            Shipperlist.add(tmp);
        }
    }
    public void xuatShipper(){
        System.out.println("\t\t\t danh sách shipper là : ");
        for (int i = 0; i < Shipperlist.size(); i++) {
            System.out.print((i+1)+ ". ");
            Shipperlist.get(i).xuat();

        }
    }
    public void nhapGrab(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số grab :");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập grab thứ "+ (i+1));
            Grab tmp =new Grab();
            tmp.nhap();
            Grablist.add(tmp);
        }
    }
    public void xuatGrab(){
        System.out.println("\t\t\t danh sách grab là : ");
        for (int i = 0; i < Grablist.size(); i++) {
            System.out.print((i+1)+ ". ");
            Grablist.get(i).xuat();

        }
    }
    public void tongTien(){
        int Tongtien=0;
        for(ongNuoc tmp : ongNuoclist)
        {
            Tongtien+=tmp.tinhTien();
            System.out.println("ống nước "+Tongtien);
        }
        for(Shipper tmp : Shipperlist)
        {
            Tongtien+=tmp.tinhTien();
            System.out.println("shipper "+Tongtien);
        }
        for(Grab tmp : Grablist)
        {
            Tongtien+=tmp.tinhTien();
            System.out.println("grab"+Tongtien);
        }
        System.out.println("tổng tiền "+ Tongtien);
    }
}
