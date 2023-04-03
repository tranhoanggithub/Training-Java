package Bai2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class TheCD {
    int id;
    String name;
    String date_create;
    float price;
    float number;

    TheCD(int id, String name, String date_create, float price, float number) {
        this.id = id;
        this.name = name;
        this.date_create = date_create;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return "TheCD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date_create='" + date_create + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }

    public float getTotalPrice() {
        return price * number;
    }
}

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<TheCD> cds = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("---------------------------------------");
            System.out.println("--1. Nhập dữ liệu");
            System.out.println("--2. Xuất dữ liệu");
            System.out.println("--3. Hiển thị các bài hát có số bài hát > 5");
            System.out.println("--4. Tính tổng tiền");
            System.out.println("--5. Thoát");
            System.out.println("---------------------------------------");
            System.out.print("Lựa chọn của bạn là: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng CD: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập thông tin cho CD thứ " + (i + 1) + "\n");
                        int id = i + 1;
                        System.out.print("Nhập tên CD: ");
                        String name = scanner.next();
                        LocalDateTime now = LocalDateTime.now();
                        String date_create = now.toString();
                        System.out.print("Nhập giá tiền cho một bài hát: ");
                        float price = scanner.nextFloat();
                        System.out.print("Nhập số lượng bài hát: ");
                        float number = scanner.nextFloat();
                        TheCD cd = new TheCD(id, name, date_create, price, number);
                        cds.add(cd);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách CD đã nhập:");
                    for (TheCD cd : cds) {
                        System.out.println(cd);
                    }
                    break;
                case 3:
                    System.out.println("Các CD có số lượng bài hát > 5:");
                    for (TheCD cd : cds) {
                        if (cd.number > 5) {
                            System.out.println(cd);
                        }
                    }
                    break;
                case 4:
                    float total = 0;
                    for (TheCD cd : cds) {
                        total += cd.getTotalPrice();
                    }
                    System.out.println("Tổng tiền của các CD là: " + total);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
                    break;
            }
        } while (choice != 5);
    }
}
