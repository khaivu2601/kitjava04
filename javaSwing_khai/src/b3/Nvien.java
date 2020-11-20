/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Nvien extends Person implements Serializable{
    private String phongBan;
    private int heSo;
    private int thamNien;
    private int luongcb;
    private int luong;
    
    public Nvien(){
        
    }

    public Nvien(String phongBan,int heSo,int thamNien,int luongcb,int luong,String hoTen, String ngaySinh, String gioiTinh , String diachi) {
        super(hoTen,ngaySinh,gioiTinh,diachi);
        this.heSo=heSo;
        this.luong=this.luongcb*this.heSo*(1+this.thamNien/100);
        this.luongcb=luongcb;
        this.phongBan=phongBan;
        this.thamNien=thamNien;
    }

    Nvien(String hoten, String ngsinh, String diachi, String gt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Nvien(String hoten, String ngsinh, String diachi, String gt, String luong, String luongcb, String heso, String thamnien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Nvien(String hoten, String ngsinh, String diachi, String gt, String luongcb, String heso, String thamnien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(int luongcb) {
        this.luongcb = luongcb;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Nvien{" + "phongBan=" + phongBan + ", heSo=" + heSo + ", thamNien=" + thamNien + ", luongcb=" + luongcb + ", luong=" + luong + '}';
    }
    
    public void xuat(){
        System.out.println(toString());
    }
}
