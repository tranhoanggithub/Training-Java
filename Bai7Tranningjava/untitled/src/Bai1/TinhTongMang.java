package untitled.src.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class TinhTongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        int n, sum = 0;
        System.out.print("Nhập kich thước của mảng: ");
        n = scanner.nextInt();
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arrList.add(scanner.nextInt());
            sum += arrList.get(i);
        }
        System.out.println("Tổng các phần tử của mảng: " + sum);
        System.out.println("Tổng các phần tử đầu tiên và cuối cùng của mảng : " + (arrList.get(0) + arrList.get(n - 1)));
    }
}
