/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.io.Serializable;

/**
 *
 * @author khaivuxuan
 */
public class Sinhvienmm extends SinhVien implements Serializable{
    private String donVi;
    private int luong;

    public Sinhvienmm(String donVi, int luong, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diem) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diem);
        this.donVi = donVi;
        this.luong = luong;
    }

    
    public Sinhvienmm() {
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhVienMatMa{" +super.toString()+ ", donVi=" + donVi + ", luong=" + luong + '}';
    }
    
    
    
    public void xuat()
    {
        System.out.println(toString());
    }
    
}
