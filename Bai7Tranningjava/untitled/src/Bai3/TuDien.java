package untitled.src.Bai3;

import java.util.*;

public class TuDien {
    private Map<String, String> data = new HashMap<>();

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng từ vựng: ");
        int n = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.println("Nhập từ tiếng Anh: ");
            String tu = scanner.nextLine();

            System.out.println("Nhập nghĩa tiếng Việt: ");
            String nghia = scanner.nextLine();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>nghia"+nghia);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>nghia"+ data);
            data.put(tu, nghia);
        }
    }

    public void xuatDuLieu() {
        System.out.println("Danh sách các từ vựng trong từ điển:");
        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void dichTu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập từ cần dịch: ");
        String tu = scanner.nextLine();

        if (data.containsKey(tu)) {
            System.out.println(tu + " : " + data.get(tu));
        } else {
            System.out.println("Không tìm thấy từ này trong từ điển.");
        }
    }

    public static void main(String[] args) {
        TuDien td = new TuDien();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("== TỪ ĐIỂN ANH VIỆT – BÀI TẬP VINAENTER EDU ==");
            System.out.println("--1. Nhập dữ liệu");
            System.out.println("--2. Xuất dữ liệu");
            System.out.println("--3. Dịch từ");
            System.out.println("--4. Thoát");

            System.out.println("Chọn chức năng (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    td.nhapDuLieu();
                    break;
                case 2:
                    td.xuatDuLieu();
                    break;
                case 3:
                    td.dichTu();
                    break;
                case 4:
                    System.out.println("Cảm ơn đã sử dụng từ điển!");
                    break;
                default:
                    System.out.println("Vui lòng nhập lựa chọn từ 1 đến 4.");
            }
        } while (choice != 4);
    }
}
