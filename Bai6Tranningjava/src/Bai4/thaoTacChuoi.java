package Bai4;

import java.util.Scanner;

public class thaoTacChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi ký tự: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        System.out.println("Các từ trong chuỗi:");
        for (String word : words) {
            System.out.println(word);
        }


        int demTu = words.length;
        System.out.println("Số từ trong chuỗi: " + demTu);

        String tuDaoNguoc = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tuDaoNguoc += str.charAt(i);
        }
        System.out.println("Chuỗi đảo ngược của chuỗi đã nhập: " +tuDaoNguoc);
    }
}
