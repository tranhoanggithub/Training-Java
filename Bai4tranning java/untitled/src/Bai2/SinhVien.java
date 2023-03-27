package Bai2;
import java.util.Scanner;

class Sinhvien {
    protected int MaSV;
    protected String TenSV;

    public void setSV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        MaSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        TenSV = sc.nextLine();
    }

    public void viewSV() {
        System.out.println("Ma sinh vien: " + MaSV);
        System.out.println("Ten sinh vien: " + TenSV);
    }
}
