package buoi5.nha;

import java.util.Scanner;

public class chung {
    private int soTrang;
    private int namXb;
    private String nhaXb;

    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số trang");
        soTrang=sc.nextInt();
        System.out.println("nhập năm xuất bản");
        namXb=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập nhà xuất bản");
        nhaXb=sc.nextLine();
    }

    public String getNhaXb() {
        return nhaXb;
    }

    @Override
    public String toString() {
        return "chung{" +
                "soTrang=" + soTrang +
                ", namXb=" + namXb +
                ", nhaXb='" + nhaXb + '\'' +
                '}';
    }
}
