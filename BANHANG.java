package buoi4.nha;

import java.util.Scanner;

public class BANHANG {
    String maSp;
    String tenSp;
    int giaNhap;
    int giaXuat;
    int soLuong;
    void nhapThongtin(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập mã sp :");
        maSp=sc.nextLine();
        System.out.println("nhập tên sp :");
        tenSp=sc.nextLine();
        sc.nextLine();
        System.out.println("nhập giá lấy vào :");
        giaNhap=sc.nextInt();
        System.out.println("nhập giá bán ra :");
        giaXuat=sc.nextInt();
        System.out.println("nhập số lượng");
        soLuong=sc.nextInt();
    }
    void laiXuat(){
        System.out.println(" nếu bán hết toàn bộ sản phẩm đó trong kho thì chủ cửa hàng sẽ lãi bao nhiêu tiền");
        System.out.printf("\n");
        int lai=giaXuat*soLuong-giaNhap*soLuong;
            if (lai > 0) {
                System.out.println("cửa hàng lãi " + lai);
            } else System.out.println("của hàng lỗ " + (lai * (-1)));
        }
    void laiXuat2(){
        System.out.println(" nếu bán hết 2/3 sản phẩm đó trong kho thì chủ cửa hàng sẽ lãi bao nhiêu tiền");
        System.out.printf("\n");
        float lai2;
        lai2=(2/3)*(giaXuat*soLuong-giaNhap*soLuong);
        {
            if (lai2 > 0) {
                System.out.printf("cửa hàng lãi %f" , lai2);
            } else System.out.printf("của hàng lỗ %f" , (lai2 * (-1)));
        }
    }
}
