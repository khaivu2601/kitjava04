/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch.b9;



/**
 *
 * @author Admin
 */
public class Number  {

    private double max;
    private double min;
    private double value;

    public Number() {
    }

    public Number(double max, double min, double value) {
        this.max = max;
        this.min = min;
        this.value = value;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean soNguyento(double value) {
        int d = 0;
        for (int i = 2; i <= value; i++) {
            if (value % i == 0) {
                d++;
            }
        }
        if (d == 2) {
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        Number s = new Number();
        System.out.println(s.soNguyento(3));
    }

    @Override
    public String toString() {
        return "Number{" + "max=" + max + ", min=" + min + ", value=" + value + '}';
    }

}
