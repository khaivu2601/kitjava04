package buoi4.lop;

public class sosanhtuoi {
    public static void main(String[] args) {
        nguoi n1 = new nguoi();
        nguoi n2 = new nguoi();
        n1.nhapnguoi();
        n1.in();
        n2.nhapnguoi();
        n2.in();
        if (n1.tuoi != n2.tuoi) {

            if (n1.tuoi < n2.tuoi)
                System.out.println("anh " + n2.ten + " lớn hơn");
            else
                System.out.println("anh " + n1.ten + " lớn hơn");
        }
        else
            System.out.println("bằng nhau");
    }
}
