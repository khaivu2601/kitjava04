/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3;

import java.io.Serializable;

/**
 *
 * @author khaivuxuan
 */
public class Person implements Serializable{
     private String diachi;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh; 
    
    public Person(String hoTen,String ngaysinh,String daichi,String gioitinh ){
        this.diachi=diachi;
        this.gioiTinh=gioitinh;
        this.hoTen=hoTen;
        this.ngaySinh=ngaysinh;
    }
    public Person(){
        
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void nhap(){
        
    }

    @Override
    public String toString() {
        return "Person{" + "diachi=" + diachi + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + '}';
    }
    void setBan(String text){
        
    }
    void setHeso(int parseInt){
        
    }
    void setThamnien(int parseInt){
        
    }
    void setLuongcb(int parseInt){
        
    }
    void setLuong(int parseInt){
        
    }
}
