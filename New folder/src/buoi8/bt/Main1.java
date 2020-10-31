package buoi8.bt;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        QuanLypt QL = new QuanLypt();
        int chon=-1;
        while (true){
            QL.Menu();
            Scanner sc=new Scanner(System.in);
            chon=sc.nextInt();
            switch (chon){
                case 1:QL.nhap();break;
                case 2:QL.xuattb();break;
                case 3:QL.xuatTheoloai();break;
                case 4:QL.TimPT();break;
                case 0:exit(0);
                default:
                    System.out.println("@.@");
            }
        }
    }

    private static void exit(int i) {
    }
}
