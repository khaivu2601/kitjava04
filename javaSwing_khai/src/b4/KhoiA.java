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
public class KhoiA extends ThiSinh implements Serializable{
    private double toan;
    private double ly;
    private double hoa;
    
    public KhoiA(double toan,double ly,double hoa){
        this.hoa=hoa;
        this.toan=toan;
        this.ly=ly;
    }
    public KhoiA(){
        
    }

    KhoiA(String hoten, String ngsinh, String diachi, String toan, String ly, String hoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    KhoiA(String hoten, String ngsinh, String diachi, double toan, double ly, double hoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void nhap(){}
    public void xuat(){}

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return "KhoiA{" + "toan=" + toan + ", ly=" + ly + ", hoa=" + hoa + '}';
    }
    
}
