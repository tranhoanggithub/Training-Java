package Bai2;
import java.util.Scanner;

public class SinhvienCNTT extends Sinhvien {
    private double dtoan;
    private double dtin;

    public void setSV() {
        super.setSV();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem toan: ");
        dtoan = sc.nextDouble();
        System.out.print("Nhap diem tin: ");
        dtin = sc.nextDouble();
    }

    public void viewSV() {
        super.viewSV();
        System.out.println("Diem toan: " + dtoan);
        System.out.println("Diem tin: " + dtin);
        System.out.println("Tong diem: " + tongdiem());
    }

    public double tongdiem() {
        return dtoan + dtin;
    }
}
