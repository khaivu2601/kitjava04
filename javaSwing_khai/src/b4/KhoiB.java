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
public class KhoiB extends ThiSinh implements Serializable{
    private double van;
    private double su;
    private double dia;
    
    public KhoiB(double van,double su,double dia){
        this.dia=dia;
        this.van=van;
        this.dia=dia;
    }
    public KhoiB(){
        
    }

    KhoiB(String hoten, String ngsinh, String diachi, double van, double su, double dia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void xuat(){}
    public void nhap(){}

    @Override
    public String toString() {
        return "KhoiB{" + "van=" + van + ", su=" + su + ", dia=" + dia + '}';
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }
    
}
