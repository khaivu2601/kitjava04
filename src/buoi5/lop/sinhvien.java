package buoi5.lop;

import java.util.Scanner;

public class sinhvien extends Nguoi{
    private String khoa;
    private String lopHoc;
    private String nganhHoc;


    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("nhập ngành học ");
        nganhHoc=sc.nextLine();
        System.out.println("nhập khóa học  ");
        khoa=sc.nextLine();
        System.out.println("nhập lớp học ");
        lopHoc=sc.nextLine();
    }
    public void sosanh(giangVien gv){
        if (this.nganhHoc.equalsIgnoreCase(gv.getKhoa())){
            System.out.printf("có cơ hội học chung");
        }
        else
            System.out.println("ko học chung");
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "sinhvien{" +
                super.toString()+
                "khoa='" + khoa + '\'' +
                ", lopHoc='" + lopHoc + '\'' +
                ", nganhHoc='" + nganhHoc + '\'' +
                '}';
    }
    public sinhvien(){
    }

}
