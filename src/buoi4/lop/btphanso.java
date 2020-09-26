package buoi4.lop;

public class btphanso {
    public static void main(String[] args) {
        phanSo n1 = new phanSo();
        phanSo n2 = new phanSo();
        n1.nhapPs();
        n2.nhapPs();
        n1.congPs(n2);
        n1.nhanPs(n2);
        n1.truPs(n2);
    }
}
