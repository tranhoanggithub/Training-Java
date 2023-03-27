package Bai3;

import java.util.Scanner;

class HoKhau extends NhanKhau {
    private String diaChiHienTai;
    private String noiCongTac;

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dia chi hien tai: ");
        diaChiHienTai = sc.nextLine();
        System.out.print("Nhap noi cong tac: ");
        noiCongTac = sc.nextLine();
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("Dia chi hien tai: " + diaChiHienTai);
        System.out.println("Noi cong tac: " + noiCongTac);
    }
}
