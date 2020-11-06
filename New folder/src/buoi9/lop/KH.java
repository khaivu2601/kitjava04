package buoi9.lop;

public class KH extends Person{
        private String soLuong;

        public KH(String name, String address, String soLuong) {
            super(name, address);
            this.soLuong=soLuong;
        }

    @Override
    public void xuat() {
        System.out.println("KH"+super.getName());
        System.out.println("KH"+super.getAddress());
        System.out.println("KH"+soLuong);
    }
}
