package Bai1;

import java.util.Random;

public class mangNgauNhien {
    public static int[] taoMangNgauNhien() {
        int[] arr = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static double averageOdd(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                sum += arr[i];
            }
        }
        return (double)sum / count;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr =  taoMangNgauNhien();
        System.out.println("Mảng gồm 20 số ngẫu nhiên: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTổng các số trong mảng: " + sum(arr));
        System.out.println("Tổng các số chẵn trong mảng: " + sumEven(arr));
        System.out.println("Trung bình cộng các số lẻ trong mảng: " + averageOdd(arr));
        System.out.println("Số lớn nhất trong mảng: " + max(arr));
    }
}
