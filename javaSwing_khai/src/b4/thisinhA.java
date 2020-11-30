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
public class thisinhA extends ThiSinh{
    private double toan;
    private double ly;
    private double hoa;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("Điểm Toán ");
        toan=sc.nextDouble();
        System.out.println("Điểm Lý");
        ly=sc.nextDouble();
        System.out.println("Điểm Hóa");
       hoa=sc.nextDouble();
    }
    
    public double tongdiem(){
    return toan+ly+hoa;
}
    @Override
    public String toString() {
        return "thisinhA{"+ super.toString() + "toan=" + toan + ", ly=" + ly + ", hoa=" + hoa + '}';
    }
public void xuat(){
    System.out.println(toString());
}
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

    public thisinhA() {
    }
    
    
}
