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
public class SinhvienHTTT extends SinhVien implements Serializable{
    private double hocPhi;

    public SinhvienHTTT(){}
    
    public SinhvienHTTT(double hocPhi){
        this.hocPhi = hocPhi;
    }

    public SinhvienHTTT(double hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diem) {
        super(maSV,hoTen,ngaySinh,gioiTinh,diem );
        this.hocPhi = hocPhi;
    }

    

    public double getHocPhi() {
        return hocPhi;
    }
    
    
    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienHTTT{" + super.toString()+", hocPhi=" + hocPhi + '}';
    }

    void xuat() {
        System.out.println(toString());
    }

    
}
