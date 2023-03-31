package Bai1;

import java.util.Scanner;

public class VeHinhTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao n: ");
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                if (j == i - 1 || i == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                if (j == i - 1 || i == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
