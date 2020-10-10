package buoi5.nha;

public class Main {
    public static void main(String[] args) {
        Sach s=new Sach();
        s.nhap();
        s.xuat();
        Tapchi tc=new Tapchi();
        tc.nhap();
        tc.xuat();
        s.sosanh(tc);

    }
}
