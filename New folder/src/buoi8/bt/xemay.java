package buoi8.bt;

import java.util.Scanner;

public class xemay extends HangXe{
    private int congSuat;

    public xemay(){}
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập coogn suất xe :");
        congSuat=sc.nextInt();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "xemay{" +
                super.toString()+
                "congSuat=" + congSuat +
                '}';
    }
}
