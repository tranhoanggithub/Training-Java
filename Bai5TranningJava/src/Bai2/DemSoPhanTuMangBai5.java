import java.util.Scanner;

public class DemSoPhanTuMangBai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Nhập số phần tử của mảng A: ");
        n = input.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + " của mảng A: ");
            A[i] = input.nextInt();
            while (A[i] <= 20 || A[i] >= 100) {
                System.out.print("Phần tử không hợp lệ. Nhập lại: ");
                A[i] = input.nextInt();
            }
        }

        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0) {
                count1++;
            }
        }
        System.out.println("Số phần tử chia hết cho 5 là: " + count1);

        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 4 == 0) {
                count2++;
            }
        }
        System.out.println("Số phần tử vừa chia hết cho 3, vừa chia hết cho 4 là: " + count2);
    }
}
