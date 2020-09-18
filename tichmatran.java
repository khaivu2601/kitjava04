package Buoi3.BTVN;

import java.awt.geom.Dimension2D;
import java.util.Scanner;
/*
11. Nhập và mảng A, B là mảng 2 chiều. Các phân tử trong mảng là các số nguyên. Tính A x B.
 */

public class tichmatran {

    static Scanner sc = new Scanner(System.in);

    public static void nhapmang1(int a[][], int d1, int c1) {
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("nhap phan tu thu a[" + i + "][" + j+"]");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void nhapmang2(int b[][], int d2, int c2) {
        for (int i = 0; i < d2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println("nhap phan tu thu b[" + i + "][" + j +"]");
                b[i][j] = sc.nextInt();
            }
        }
    }

    public static void inmanga(int a[][], int d1, int c1) {
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void inmang2(int b[][], int d2, int c2) {
        for (int i = 0; i < d2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("%5d", b[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhap so dong mang a");
        int d1 = sc.nextInt();
        System.out.println("nhap so  cot a");
        int c1 = sc.nextInt();
        System.out.println("nhap so dong mang b");
        int d2 = sc.nextInt();
        System.out.println("nhap so  cot b");
        int c2 = sc.nextInt();
        int[][] a = new int[d1][c1];
        int[][] b = new int[d2][c2];
        int[][] c =new int[d1][c2];
             if (c1!=d2){
                  System.out.println("nhập lại");
                 System.out.println("nhap so  cot a");
                  c1=sc.nextInt();
                 System.out.println("nhap so dong mang b");
                  d2=sc.nextInt();}
                     else
                        nhapmang1(a, d1, c1);
                        nhapmang2(b, d2, c2);
                        System.out.println("mảng a là :");
                        inmanga(a, d1, c1);
                        System.out.println("mảng b là :");
                        inmang2(b, d2, c2);

        for (int i=0;i<d1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    c[i][j]=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("mảng tích là :");
        for (int i=0;i<d1;i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("%5d",c[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
