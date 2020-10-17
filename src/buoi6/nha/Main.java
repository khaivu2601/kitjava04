package buoi6.nha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chon=-1;
        Quanly QLTV = new Quanly();
        while (true)
        {
            QLTV.Menu();
            chon = new Scanner( System.in).nextInt();
            switch (chon)
            {
                case 1: QLTV.nhapongNuoc();break;
                case 2: QLTV.xuatongNuoc();break;
                case 3: QLTV.nhapShipper();break;
                case 4: QLTV.xuatShipper();break;
                case 5: QLTV.nhapGrab(); break;
                case 6: QLTV.xuatGrab();break;
                case 7: QLTV.xuatTb();break;
                case 8: QLTV.tongTien();break;
                case 9: QLTV.thongKeLuongGiamDan();break;
                case 0: return;
                default:
                    System.out.println("Bạn chọn sai rồi");
            }
        }



    }
}
