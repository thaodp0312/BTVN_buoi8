import java.util.Scanner;

public class mangmotchieu {
    void nhapmangmotchieu() {
        System.out.println("Nhập số phần tử của mảng số nguyên n= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2;
        int mang[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + " = ");
            Scanner sc2 = new Scanner(System.in);
            n2 = sc2.nextInt();
            mang[i]=n2;
        }
        int tong=0;
        System.out.println("Các phần tử là số nguyên tố: ");
        for (int i = 0;i<n; i++){

            if (checknguyento(mang[i])==true){
                System.out.print(mang[i]+"\t");
                tong = tong + mang[i];
            }
        }
        System.out.println();
        System.out.println("Tổng các số nguyên tố là: "+tong);
        System.out.print("Nhập vị trí k = ");
        Scanner sc3 = new Scanner(System.in);
        int k = sc3.nextInt();
        System.out.print("Sửa phần tử thứ "+k+" sang giá trị mới = ");
        Scanner sc4 = new Scanner(System.in);
        int x = sc4.nextInt();
        mang[k-1]=x;
        System.out.println("Mảng số nguyên mới là: ");
        for (int i=0;i<n;i++){
            System.out.print(mang[i]+"\t");
        }
    }
    boolean checknguyento(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }

        }
        return true;
    }
}
