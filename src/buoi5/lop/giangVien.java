package buoi5.lop;

import java.util.Scanner;

public class giangVien extends Nguoi {

    private String namKn;
    private String khoa;
    private String dayMon;

    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập khoa ");
        khoa=sc.nextLine();
        System.out.println("nhập môn dạy  ");
        dayMon=sc.nextLine();
        System.out.println("nhập năm kinh nghiệm");
        namKn=sc.nextLine();
    }

    public String getKhoa() {
        return khoa;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "giangVien{" +
                super.toString()+
                "namKn='" + namKn + '\'' +
                ", khoa='" + khoa + '\'' +
                ", dayMon='" + dayMon + '\'' +
                '}';
    }
    public giangVien(){
    }
}
