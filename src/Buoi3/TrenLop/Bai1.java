package Buoi3.TrenLop;

import java.util.Scanner;

public class Bai1 {

    static Scanner sc = new Scanner(System.in);

    public static void nhapmang(int a[][], int sodong, int socot) {

        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.printf("nhập phần tử mảng a[%d][%d]", i, j);
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void xuatmang(int a[][], int sodong, int socot) {
        System.out.println("manrg vua nhap la");
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static void tongptu ( int a[][], int sodong, int socot){
        int sum = 0;
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                sum = sum + a[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int sodong=3;
        int socot=3;
        int [][]a= new int[sodong][socot];
        nhapmang(a,sodong,socot);
        tongptu(a,sodong,socot);
    }
}
