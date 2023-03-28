import java.util.Scanner;

public class arSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        do {
            System.out.print("Nhap so phan tu cua mang (m > 0): ");
            m = sc.nextInt();
        } while (m <= 0);

        int[] arSoNguyen = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arSoNguyen[i] = sc.nextInt();
        }

        System.out.println("Cac phan tu da nhap vao mang:");
        for (int i = 0; i < m; i++) {
            System.out.print(arSoNguyen[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arSoNguyen[i];
        }
        System.out.println("Tong cac phan tu cua mang: " + sum);


        int countPositive = 0;
        int sumPositive = 0;
        for (int i = 0; i < m; i++) {
            if (arSoNguyen[i] > 0) {
                countPositive++;
                sumPositive += arSoNguyen[i];
            }
        }
        System.out.println("So luong cac phan tu duong: " + countPositive);
        System.out.println("Tong cac phan tu duong: " + sumPositive);


        int countNegative = 0;
        int sumNegative = 0;
        for (int i = 0; i < m; i++) {
            if (arSoNguyen[i] < 0) {
                countNegative++;
                sumNegative += arSoNguyen[i];
            }
        }
        System.out.println("So luong cac phan tu am: " + countNegative);
        System.out.println("Tong cac phan tu am: " + sumNegative);


        if (countPositive > 0) {
            double avgPositive = (double) sumPositive / countPositive;
            System.out.println("Trung binh cong cac phan tu duong: " + avgPositive);
        } else {
            System.out.println("Khong co phan tu duong trong mang");
        }


        if (countNegative > 0) {
            double avgNegative = (double) sumNegative / countNegative;
            System.out.println("Trung binh cong cac phan tu am: " + avgNegative);
        } else {
            System.out.println("Khong co phan tu am trong mang");
        }


        int firstPositiveIndex = -1;
        for (int i = 0; i < m; i++) {
            if (arSoNguyen[i]
                    > 0) {
                firstPositiveIndex = i;
                break;
            }
        }
        if (firstPositiveIndex >= 0) {
            System.out.println("Chi so cua so hang duong dau tien: " + firstPositiveIndex);
        } else {
            System.out.println("Khong co so hang duong trong mang");
        }


        int lastNegativeIndex = -1;
        for (int i = m - 1; i >= 0; i--) {
            if (arSoNguyen[i] < 0) {
                lastNegativeIndex = i;
                break;
            }
        }
        if (lastNegativeIndex >= 0) {
            System.out.println("Chi so cua so hang am cuoi cung: " + lastNegativeIndex);
        } else {
            System.out.println("Khong co so hang am trong mang");
        }

        int countGreaterThan50 = 0;
        for (int i = 0; i < m; i++) {
            if (arSoNguyen[i] > 50) {
                countGreaterThan50++;
            }
        }
        System.out.println("So luong cac so > 50: " + countGreaterThan50);
    }
}