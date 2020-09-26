package buoi4.lop;

import java.util.Scanner;

public class phanSo {
    int tuSo;
    int mauSo;

    void nhapPs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tử số ");
        tuSo = sc.nextInt();
        System.out.println("nhập mẫu số");
        mauSo = sc.nextInt();
    }
    void congPs(phanSo ps){
        System.out.println("toorng phaan soos la");
        phanSo cong=new phanSo();
        cong.tuSo=this .tuSo*ps.mauSo + ps.tuSo* this .mauSo;
        cong.mauSo=this.mauSo* ps.mauSo;
        cong.ucLn();
        cong.inPs();
    }
    void truPs(phanSo ps){
        System.out.println("hiệu phân số là ");
        phanSo cong=new phanSo();
        cong.tuSo=this .tuSo*ps.mauSo - ps.tuSo* this .mauSo;
        cong.mauSo=this.mauSo* ps.mauSo;
        cong.ucLn();
        cong.inPs();
    }
    void nhanPs(phanSo ps){
        System.out.println("tích phân số là ");
        phanSo cong=new phanSo();
        cong.tuSo=this .tuSo*ps.tuSo ;
        cong.mauSo=this.mauSo* ps.mauSo;
        cong.ucLn();
        cong.inPs();
    }

    int ucLn() {
        int a= 1;
        for (int i = 1; i < (tuSo * mauSo); i++) {

            if (tuSo % i == 0 && mauSo % i == 0) {
                a=i;
            }
        }
        return a;
    }

        void inPs(){
        System.out.println("phân số đã nhập là "+ tuSo/ucLn() + "/" +mauSo/ucLn() );
    }
}
