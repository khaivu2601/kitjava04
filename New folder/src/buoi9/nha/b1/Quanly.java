package buoi9.nha.b1;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanly {
    Scanner sc=new Scanner(System.in);
    ArrayList<animal> DongVatList=new ArrayList<>();
    public void nhaploaimeo(){
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("i")){
                break;
            }
            cat tmp = new cat("name()");
            DongVatList.add(tmp);
            System.out.println("ban co muon nhap nua kh?? ");
            chon=sc.nextLine();
        }
    }
    public void nhaploaibo(){
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("i")){
                break;
            }
            cow tmp = new cow("name()");
            DongVatList.add(tmp);
            System.out.println("ban co muon nhap nua kh??");
            chon=sc.nextLine();
        }
    }
    public void nhaploaicho(){
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("i")){
                break;
            }
            dog tmp = new dog("name()");
            }
        int tmp;
        DongVatList.add(tmp);
            System.out.println("ban co muon nhap nua kh?? ");
            chon=sc.nextLine();
        }
    public void catheloaicho(){
        int i=0;
        for(animal tmp:DongVatList){
            if(DongVatList.get(i) instanceof dog) {
                tmp.introduce();
            }
        }
    }
    public void catheloaimeo(){
        int i=0;
        for(animal tmp:DongVatList){
            if(DongVatList.get(i) instanceof cat) {
                tmp.introduce();
            }
        }
    }
    public void catheloaibo(){
        int i=0;
        for(animal tmp:DongVatList){
            if(DongVatList.get(i) instanceof dog) {
                tmp.introduce();
            }
        }
    }
    public Quanly() {
    }

}
