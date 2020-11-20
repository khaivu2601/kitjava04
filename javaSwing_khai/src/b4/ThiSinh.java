/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class ThiSinh implements Serializable{
    private String diachi;
    private String hoTen;
    private String ngaySinh;
    
    public ThiSinh(){
        
    }
    public ThiSinh(String HoTen, String NgaySinh, String DiaChi) {
        this.hoTen = HoTen;
        this.ngaySinh = NgaySinh;
        this.diachi = DiaChi;
    }
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "diachi=" + diachi + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + '}';
    }
    
}
