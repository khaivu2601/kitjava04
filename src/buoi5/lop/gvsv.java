package buoi5.lop;

public class gvsv {
    public static void main(String[] args) {
        bai1 hocvien= new bai1();
        bai1 giangvien=new bai1();
        System.out.println("học viên");
        hocvien.nhaphocvien();
        System.out.println("giảng viên");
        giangvien.nhapGiangvien();
        hocvien.inHocvien();
        giangvien.inGiangvien();
    }
}
