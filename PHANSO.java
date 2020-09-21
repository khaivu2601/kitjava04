package buoi4.nha;

import java.util.Scanner;

public class PHANSO {
    int tuSo;int mauSo;
    void nhapPs(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tử số");
        tuSo=sc.nextInt();
        System.out.println("nhập mẫu số");
        mauSo=sc.nextInt();
    }
    int ucLN(){
        int a=1;
        for (int i=1;i<(tuSo*mauSo);i++){
            if (tuSo % i==0&& mauSo %i ==0)
                a=i;
        }
        return a;
    }
    void inPs(){
        double c=tuSo/ucLN();
        double d=mauSo/ucLN();
        System.out.println("phân số vừa nhập là"+tuSo/ucLN()+"/"+mauSo/ucLN());
        System.out.printf("dạng thập phân là %5f",c/d );
    }
}
