package Bai1;

import java.util.Scanner;

public class Giaiptbac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 0, b = 0, x = 0;

        try {
            System.out.print("Nhập a: ");
            a = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai kiểu dữ liệu cho a.");
            System.exit(0);
        }

        try {
            System.out.print("Nhập b: ");
            b = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai kiểu dữ liệu cho b.");
            System.exit(0);
        }

        try {
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                x = -b / a;
                System.out.printf("Nghiệm của phương trình là:", x);
            }
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Chia cho 0.");
            System.exit(0);
        }

        input.close();
    }
}
