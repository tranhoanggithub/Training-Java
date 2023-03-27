package Bai3;

public class QuanLyDanSo {
    public static void main(String[] args) {
        NhanKhau nk = new NhanKhau();
        HoKhau hk = new HoKhau();

        System.out.println("Nhap thong tin Nhan Khau:");
        nk.nhapThongTin();
        System.out.println("Thong tin Nhan Khau:");
        nk.inThongTin();

        System.out.println("Nhap thong tin Ho Khau:");
        hk.nhapThongTin();
        System.out.println("Thong tin Ho Khau:");
        hk.inThongTin();
    }
}
