package buoi5.lop;

public class Main {
    public static void main(String[] args) {
        sinhvien sv=new sinhvien();
        sv.nhap();
        sv.xuat();
        giangVien gv=new giangVien();
        gv.nhap();
        gv.xuat();
        sv.sosanh(gv);
        System.out.println();
    }
}
