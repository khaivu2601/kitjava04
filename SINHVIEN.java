package buoi4.nha;

import java.util.Scanner;

public class SINHVIEN {
    String maSv;
    String ten;
    String queQuan;
    int diemThia1;
    int diemThia3;
    void nhapThongtin(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập mã sv:");
        maSv =sc.nextLine();
        System.out.println("nhập tên sv;");
        ten=sc.nextLine();
        System.out.println("nhập quê quán;");
        queQuan=sc.nextLine();
        sc.nextLine();
        System.out.println("nhập điểm thi a1");
        diemThia1=sc.nextInt();
        System.out.println("nhập điểm thi a3");
        diemThia3=sc.nextInt();
    }
    void tinhTien(){
        int dem=0;
        if (diemThia1 < 4){
            if (diemThia3 < 4){
                dem=dem+2;
            }
            else
                dem=dem+1;
        }
        int tien=dem*90;
        System.out.println("số tiền nộp là "+ tien);
    }
}
