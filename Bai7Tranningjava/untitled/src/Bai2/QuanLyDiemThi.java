import java.util.*;

class ThiSinh implements Comparable<ThiSinh> {
    private String ten;
    private double toan;
    private double ly;
    private double hoa;

    public ThiSinh(String ten, double toan, double ly, double hoa) {
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten thi sinh: ");
        this.ten = scanner.nextLine();

        System.out.print("Nhap diem toan: ");
        this.toan = scanner.nextDouble();

        System.out.print("Nhap diem ly: ");
        this.ly = scanner.nextDouble();

        System.out.print("Nhap diem hoa: ");
        this.hoa = scanner.nextDouble();
    }

    public double tinhTongDiem() {
        return this.toan + this.ly + this.hoa;
    }

    public void inThongTin() {
        System.out.println("Thi sinh: " + this.ten);
        System.out.println("Diem toan: " + this.toan);
        System.out.println("Diem ly: " + this.ly);
        System.out.println("Diem hoa: " + this.hoa);
        System.out.println("Tong diem: " + this.tinhTongDiem());
    }

    @Override
    public int compareTo(ThiSinh other) {
        return Double.compare(other.tinhTongDiem(), this.tinhTongDiem());
    }
}

public class QuanLyDiemThi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong thi sinh: ");
        int n = scanner.nextInt();

        List<ThiSinh> danhSach = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin thi sinh thu " + (i + 1));
            ThiSinh thiSinh = new ThiSinh("", 0, 0, 0);
            thiSinh.nhapThongTin();
            danhSach.add(thiSinh);
        }

        System.out.println("Danh sach thi sinh trung tuyen:");

        for (ThiSinh thiSinh : danhSach) {
            if (thiSinh.tinhTongDiem() >= 17) {
                thiSinh.inThongTin();
            }
        }
        System.out.println(">>>>>>>>>>>>>"+danhSach);
        Collections.sort(danhSach);

        System.out.println("Danh sach thi sinh trung tuyen theo thu tu giam dan diem:");


        for (ThiSinh thiSinh : danhSach) {
            if (thiSinh.tinhTongDiem() >= 17) {
                thiSinh.inThongTin();
            }
        }
    }
}
