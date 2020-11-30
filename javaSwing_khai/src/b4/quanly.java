
package b4;

import java.util.ArrayList;
import java.util.Scanner;


public class quanly {
    Scanner sc=new Scanner(System.in);
    ArrayList<ThiSinh> dsThiSinh=new ArrayList<>();
    public void nhapkhoiA(){
        int n;
        System.out.println("nhập số thí sinh khối A");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            thisinhA tmp=new thisinhA();
            tmp.nhap();
            dsThiSinh.add(tmp);
        }
    }
     public void nhapkhoiC(){
        int n;
        System.out.println("nhập số thí sinh khối C");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            thisinhC tmp=new thisinhC();
            tmp.nhap();
            dsThiSinh.add(tmp);
        }
    }
     public void thisinhtrungtuyen(){
         int i=0;
     for(ThiSinh tmp:dsThiSinh){
         if(dsThiSinh.get(i).tongdiem()>20){
           tmp.xuat();
         }
         i++;
     }
     }

    public quanly() {
    }
     
}
