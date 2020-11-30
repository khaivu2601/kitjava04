/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class thisinhC extends  ThiSinh {
    private double van;
     private double su;
     private double dia;
       public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("Điểm văn ");
        van=sc.nextDouble();
        System.out.println("Điểm sử");
        su=sc.nextDouble();
        System.out.println("Điểm Địa");
       dia=sc.nextDouble();
    }
public double tongdiem(){
    return (van+su+dia);
}
    @Override
    public String toString() {
        return "thisinhC{"+super.toString() + "van=" + van + ", su=" + su + ", dia=" + dia + '}';
    }
public void xuat(){
    System.out.println(toString());
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

    public thisinhC() {
    }
       
}
