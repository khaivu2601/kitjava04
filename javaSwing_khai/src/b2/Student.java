/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Student extends Person implements Serializable{
    private String maSV;
    private String Email;
    private float diem;
    public Student(String maSV,String Email,float diem){
        
    }

    Student(String maSv, String email, String ngsinh, String hoten, String gt, String diachi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" + "maSV=" + maSV + ", Email=" + Email + ", diem=" + diem + '}';
    }
    void xuat(){
        System.out.println(toString());
    }
}
