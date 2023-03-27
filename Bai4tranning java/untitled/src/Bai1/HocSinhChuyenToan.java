package Bai1;

public class HocSinhChuyenToan extends HocSinh {
    public HocSinhChuyenToan(String hoTen, String lop, float toan, float ly, float hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }

    @Override
    public float diemTrungBinh() {
        return ((toan * 2) + ly + hoa) / 4;
    }
}


