package buoi9.nha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class {
    List<Student> st = new ArrayList<Student>();
    Scanner sc=new Scanner(System.in);

    public Class(){}

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số học sinh cần nhập: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("NHAP học sinh THU " + (i + 1));
            Student tmp  = new Student();
           tmp.getName();
           tmp.getAddress();
           tmp.getDepartmen();
           tmp.getClass();
           st.add(tmp);
        }
    }
    public void xuat(){
        System.out.println("danh sách trẻ em là ");
        for (int i = 0; i < st.size(); i++) {
            st.get(i).getName();
            st.get(i).getAddress();
            st.get(i).getDepartmen();
            st.get(i).getClass();

        }
    }
}
