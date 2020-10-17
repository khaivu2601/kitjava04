package buoi6.nha;

import buoi6.TreEm;
import buoi6.nguoiLon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Quanly {
   private ArrayList<chung> danhSachNV=new ArrayList<>();


    public void Menu(){
        System.out.println("\t \t \t Quản lý hệ thống ");
        System.out.println("1.Nhập thợ sửa ống nước");
        System.out.println("2.Xuất thhowj sửa ống nước");
        System.out.println("3.nhập shipper");
        System.out.println("4.Xuất shipper");
        System.out.println("5.nhập grab");
        System.out.println("6.Xuất grab");
        System.out.println("7.tính tiền ");
        System.out.println("8.xuất toàn bộ nv");
        System.out.println("0.exit");
        System.out.println("Mời bạn chọn ");
    }
    public void xuatTb(){
        for (chung tmp : danhSachNV){
            tmp.xuat();
        }
    }
    public Quanly(){
    }
    public void nhapongNuoc(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số thợ sửa ống nc: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("NHAP thợ thứ " + (i + 1));
            ongNuoc tmp = new ongNuoc();
            tmp.nhap();
            danhSachNV.add(tmp);

        }
    }
    public void xuatongNuoc(){
        System.out.println("\t\t\t danh sách thợ là : ");
        for (int i = 0; i < danhSachNV.size(); i++) {
            System.out.print((i+1)+ ". ");
            danhSachNV.get(i).xuat();

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
            danhSachNV.add(tmp);
        }
    }
    public void xuatShipper(){
        System.out.println("\t\t\t danh sách shipper là : ");
        for (int i = 0; i < danhSachNV.size(); i++) {
            System.out.print((i+1)+ ". ");
            danhSachNV.get(i).xuat();

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
            danhSachNV.add(tmp);
        }
    }
    public void xuatGrab(){
        System.out.println("\t\t\t danh sách grab là : ");
        for (int i = 0; i < danhSachNV.size(); i++) {
            System.out.print((i+1)+ ". ");
            danhSachNV.get(i).xuat();

        }
    }
    public void tongTien(){
    }
    public void thongKeLuongGiamDan() {
        System.out.println("\t\tNhanVienOngNUOc");
        SapXepLuongNVOngNuocGiamDan();
        for( chung tmp : danhSachNV)
        {
            tmp.xuat();
        }
        System.out.println("\t\tNhanVienXeOm");
        SapXepLuongNVXeOmGiamDan();
        for(chung tmp : danhSachNV)
        {
            tmp.xuat();
        }
        System.out.println("\t\tNhanVienShipper");
        SapXepLuongShipperGiamDan();
        for(chung tmp : danhSachNV)
        {
            tmp.xuat();
        }
    }

    private void SapXepLuongShipperGiamDan() {
        for (int i = 0; i < danhSachNV.size()-1; i++) {
            for (int j=i+1;j<danhSachNV.size();j++){
                if(danhSachNV.get(i).tinhTien()<danhSachNV.get(j).tinhTien()) {
                    Shipper tmp;
                    tmp = (Shipper) danhSachNV.get(i);
                    danhSachNV.set(i, danhSachNV.get(j));
                    danhSachNV.set(j, tmp);
                }
            }
        }
    }

    private void SapXepLuongNVXeOmGiamDan() {
        for (int i = 0; i < danhSachNV.size() - 1; i++) {
            for (int j = i + 1; j < danhSachNV.size(); j++) {
                if (danhSachNV.get(i).tinhTien() < danhSachNV.get(j).tinhTien()) {
                    Grab tmp;
                    tmp = (Grab) danhSachNV.get(i);
                    danhSachNV.set(i, danhSachNV.get(j));
                    danhSachNV.set(j, tmp);
                }
            }
        }
    }
        private void SapXepLuongNVOngNuocGiamDan(){
            for (int i = 0; i < danhSachNV.size() - 1; i++) {
                for (int j = i + 1; j < danhSachNV.size(); j++) {
                    if ( danhSachNV.get(i).tinhTien() < danhSachNV.get(j).tinhTien() ) {
                        ongNuoc tmp;
                        tmp = (ongNuoc) danhSachNV.get(i);
                        danhSachNV.set(i,danhSachNV.get(j));
                        danhSachNV.set(j,tmp);
                    }
                }
            }
        }

}
