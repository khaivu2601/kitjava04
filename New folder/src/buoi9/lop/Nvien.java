package buoi9.lop;

public class Nvien extends Person{
        private String tienLuong;

    public Nvien(String name, String address, String tienLuong) {
        super(name, address);
        this.tienLuong=tienLuong;
    }

    @Override
    public void xuat() {
        System.out.println("KH"+super.getName());
        System.out.println("KH"+super.getAddress());
        System.out.println("KH"+tienLuong);
    }


}
