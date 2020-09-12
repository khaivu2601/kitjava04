package Buoi3.TrenLop;

import java.util.Scanner;

public class tanggiam {
    static int a[];
    static int n;
    static Scanner sc = new Scanner(System.in);
    public static void nhapmang(){
        System.out.println("nhap n");
        n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("phan tu thu a["+i+"]");
        }
    }
    public static void tachmang(){

    }
    public static void main(String[] args) {
        int n;
        int [] a=new int[n];
        n= sc.nextInt();
        nhapmang();
    }
}

