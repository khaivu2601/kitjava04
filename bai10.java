package Buoi3.BTVN;
/*10. Nhập mảng 2 chiều các số nguyên dương có dạng là ma trận 3x3. Sắp xếp lại các phần tử trong
mảng theo thứ tự tăng dần.
 */

import java.util.Scanner;

public class bai10 {
    static Scanner sc = new Scanner(System.in);

    public static void nhapmmang(int a[][],int sodong,int socot) {
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.println("nhập phần tử thứ s[" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void inmang(int a[][],int sodong,int socot) {

        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.printf( "%5d",a[i][j]);
            }
            System.out.printf("\n");
        }

    }

    public static void sapxep(int a[][],int sodong,int socot) {
        System.out.println("mảng đã sắp xếp là ");
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                if (a[i][j]>a[0][0]){
                    int tmp=a[0][0];
                    a[0][0]=a[i][j];
                    a[i][j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int sodong=3;
        int socot=3;
        int [][] a=new int[sodong][socot];
        nhapmmang(a,sodong,socot);
        System.out.println("mang vua nhap la ");
        inmang(a,sodong,socot);
        sapxep(a,sodong,socot);
        inmang(a,sodong,socot);
    }
}