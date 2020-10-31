package buoi8.dahinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       QuanLy QuanLy=new QuanLy();
        int chon=-1;
        while (true){
            QuanLy.Menu();
            Scanner sc=new Scanner(System.in);
            chon=sc.nextInt();
            switch (chon)
            {
                case 1: QuanLy.nhap(); break;
                case 2: QuanLy.xuatTb(); break;
                case 3: QuanLy.xuatTp(); break;
                case 0: exit(0);
                default:
                    System.out.println("Nhập lại!");
            }
        }
    }

    private static void exit(int i) {
    }
}
