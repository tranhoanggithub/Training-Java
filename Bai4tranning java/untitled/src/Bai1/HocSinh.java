package Bai1;
import static java.lang.System.out;

public class HocSinh {
    private String hoTen;
    private String lop;
    private float toan;
    private float ly;
    private float hoa;

    public HocSinh(String hoTen, String lop, float toan, float ly, float hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public float diemTrungBinh() {
        return (toan + ly + hoa) / 3;
    }
}


