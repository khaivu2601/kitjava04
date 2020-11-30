/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch.b9;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Number implements Serializable{
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
    
    public boolean la_SNT(double value)
    {
        if(value < 2)
            return false;
        if(value ==2)
            return true;
        for(int i= 2 ; i<=Math.sqrt(value); i++)
        {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
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

    @Override
    public String toString() {
        return "Number{" + "max=" + max + ", min=" + min + ", value=" + value + '}';
    }
    
    
}
