package Bai5;

import java.util.Scanner;

public class chuoiDaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        str = str.replace('e', '3');
        str = str.replace('g', '9');


        String chuoiDaoNguoc = new StringBuilder(str).reverse().toString();

        System.out.println("Chuỗi sau khi đảo ngược: " + chuoiDaoNguoc);
    }
}
