/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b7;

/**
 *
 * @author LENOVO
 */
public class NhanVien extends Person{
    private String PhongBan;
    private float HeSoLuong;
    private float ThamNien;
    private float LuongCoBan;

    public NhanVien() {
    }

    public NhanVien(String PhongBan, float HeSoLuong, float ThamNien, float LuongCoBan) {
        this.PhongBan = PhongBan;
        this.HeSoLuong = HeSoLuong;
        this.ThamNien = ThamNien;
        this.LuongCoBan = LuongCoBan;
    }
    public float LuonThucLinh(){
        float luong = Float.valueOf(LuongCoBan * HeSoLuong * ( 1 + ThamNien / 100));
        return luong;
    }
    
    public void KhoiTao(){
        
    }
    public void HienTHi(){
        
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public float getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(float HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public float getThamNien() {
        return ThamNien;
    }

    public void setThamNien(float ThamNien) {
        this.ThamNien = ThamNien;
    }

    public float getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(float LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString()+ "luon thuc linh" +LuonThucLinh()
                +"PhongBan=" + PhongBan + ", HeSoLuong=" + HeSoLuong + ", "
                + "ThamNien=" + ThamNien + ", LuongCoBan=" + LuongCoBan + '}';
    }
    
}
