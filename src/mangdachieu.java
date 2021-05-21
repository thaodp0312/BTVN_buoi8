import java.util.Scanner;

public class mangdachieu {
    void nhapmangdachieu() {
        System.out.println("Nhập kích thước ma trận vuông n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matran[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("Nhập phần tử [" + i + "][" + j + "] = ");
                Scanner sc2 = new Scanner(System.in);
                int n2 = sc2.nextInt();
                matran[i][j] = n2;
            }
        }
        System.out.println("Hiển thị ma trận vuông A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matran[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Các phần tử đường chéo chính: ");
        int tong = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(matran[i][j] + "\t");
                    tong = tong + matran[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Tổng các phần tử thuộc đường chéo chính là: " + tong);
        int tam, min;
        System.out.println("hàng 2: ");

        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (matran[1][j] < matran[1][min]) {
                    min = j;
                }
                tam = matran[1][i];
                matran[1][i] = matran[1][min];
                matran[1][min] = tam;
            }
        }

        System.out.println("Sắp xếp hàng 2 trong mảng theo chiều tăng dần ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                    System.out.print(matran[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
