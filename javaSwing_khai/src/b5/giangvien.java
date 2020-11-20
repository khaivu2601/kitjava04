/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class giangvien implements Serializable {
    private String hoTen;
    private String Ma;
    private String diachi;
    private String gtinh;
    private String khoa;
    
    
    public giangvien(String hoTen,String Ma,String diachi,String gtinh,String khoa){
        this.Ma=Ma;
        this.diachi=diachi;
        this.gtinh=gtinh;
        this.hoTen=hoTen;
        this.khoa=khoa;
    }
    public giangvien(){
        
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGtinh() {
        return gtinh;
    }

    public void setGtinh(String gtinh) {
        this.gtinh = gtinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    public void nhap(){
        
    }
    public void xuat(){}

    @Override
    public String toString() {
        return "giangvien{" + "hoTen=" + hoTen + ", Ma=" + Ma + ", diachi=" + diachi + ", gtinh=" + gtinh + ", khoa=" + khoa + '}';
    }

    private void getGtinh(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
