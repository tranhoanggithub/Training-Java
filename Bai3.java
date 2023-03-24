//Bài 1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int sochiahetcho5 = 0;
        int csochiahetcho3 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0) {
                sochiahetcho5++;
            }
            if (i % 3 == 0) {
                csochiahetcho3++;
            }
        }

        System.out.println("Số lượng số chia hết cho 5 là: " + sochiahetcho5);
        System.out.println("Số lượng số chia hết cho 3 là: " + csochiahetcho3);
    }
}

//Bài 2
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    
    // Phương thức tạo số ngẫu nhiên từ 8-18
    public static int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(11) + 8; 
        return randomNumber;
    }
    
    // Phương thức nhập số từ bàn phím
    public static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần so sánh: ");
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }
    
    // Phương thức so sánh số nhập từ bàn phím với số ngẫu nhiên đã tạo
    public static void compareNumbers(int randomNumber, int inputNumber) {
        if (inputNumber == randomNumber) {
            System.out.println("Chúc mừng! Bạn đã đoán đúng số ngẫu nhiên là: " + randomNumber);
        } else {
            System.out.println("Rất tiếc! Số ngẫu nhiên là: " + randomNumber);
        }
    }
    
    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        int inputNumber = getInputNumber();
        compareNumbers(randomNumber, inputNumber);
    }
}
//Bài 3
public class DocSo {

    private static final String[] UNITS = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
    private static final String[] TEN_TO_NINETEEN = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
    private static final String[] TENS = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

    public static String DocSo(int n) {
        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("Số nhập vào phải nằm trong khoảng từ 0 đến 999.");
        }
        if (n == 0) {
            return "Không";
        }
        int hundreds = n / 100;
        int tens = (n % 100) / 10;
        int units = n % 10;
        StringBuilder result = new StringBuilder();
        if (hundreds > 0) {
            result.append(UNITS[hundreds]).append(" trăm ");
        }
        if (tens == 0 && units > 0) {
            result.append("lẻ ");
        }
        if (tens == 1) {
            result.append(TEN_TO_NINETEEN[units]);
        } else {
            result.append(TENS[tens]);
            if (units > 0) {
                result.append(" ").append(UNITS[units]);
            }
        }
        return result.toString().trim();
    }
}
//Bài 4
import java.util.Scanner;

public class HocVien {
    private String maHV;
    private String tenHV;
    private String lop;
    private double diemJava;
    private double diemOracle;
    private double diemProject;

    // Getter methods
    public String getMaHV() {
        return maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public String getLop() {
        return lop;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public double getDiemOracle() {
        return diemOracle;
    }

    public double getDiemProject() {
        return diemProject;
    }

    // Setter methods
    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public void setDiemOracle(double diemOracle) {
        this.diemOracle = diemOracle;
    }

    public void setDiemProject(double diemProject) {
        this.diemProject = diemProject;
    }

    // Phương thức nhập thông tin học viên từ bàn phím
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã học viên: ");
        maHV = scanner.nextLine();

        System.out.print("Nhập tên học viên: ");
        tenHV = scanner.nextLine();

        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();

        System.out.print("Nhập điểm Java: ");
        diemJava = scanner.nextDouble();

        System.out.print("Nhập điểm Oracle: ");
        diemOracle = scanner.nextDouble();

        System.out.print("Nhập điểm Project: ");
        diemProject = scanner.nextDouble();

        public void xemThongTin() {
            System.out.println("Mã học viên: " + maHV);
            System.out.println("Tên học viên: " + tenHV);
            System.out.println("Lớp: " + lop);
            System.out.println("Điểm Java: " + diemJava);
            System.out.println("Điểm Oracle: " + diemOracle);
            System.out.println("Điểm Project: " + diemProject);
        }
        
        public double tinhDTB() {
            double dtb = (diemJava + diemOracle + diemProject) / 3;
            return dtb;
        }
        
        public static void timDTBCaoNhat(HocVien hv1, HocVien hv2, HocVien hv3) {
            double dtb1 = hv1.tinhDTB();
            double dtb2 = hv2.tinhDTB();
            double dtb3 = hv3.tinhDTB();
            
            double maxDTB = Math.max(dtb1, Math.max(dtb2, dtb3));
            
            System.out.println("Điểm trung bình cao nhất là: " + maxDTB);
        }
    }

    //Bài 5
    public class Rectangle {
        private int length;
        private int width;
    
        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }
    
        public int getLength() {
            return length;
        }
    
        public int getWidth() {
            return width;
        }
    
        public int getPerimeter() {
            return 2 * (length + width);
        }
    
        public int getArea() {
            return length * width;
        }
    
        public void draw() {
            for (int i = 1; i <= width; i++) {
                for (int j = 1; j <= length; j++) {
                    if (i == 1 || i == width || j == 1 || j == length) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
    


