import java.util.Scanner;

//Bài 2
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tong cac so nguyen tu 1 den " + n + " la: " + sum);
    }
}

//Bài 3
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao mot thang trong nam: ");
        int month = input.nextInt();
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                System.out.print("Nhap vao nam: ");
                int year = input.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Thang khong hop le!");
                return;
        }
        System.out.println("Thang " + month + " co " + days + " ngay.");
    }
}

//Bài 4
public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất: ");
        int number1 = scanner.nextInt();

        System.out.println("Nhập số thứ hai: ");
        int number2 = scanner.nextInt();

        System.out.println("Nhập số thứ ba: ");
        int number3 = scanner.nextInt();

        int min = number1;

        if (number2 < min) {
            min = number2;
        }

        if (number3 < min) {
            min = number3;
        }

        System.out.println("Số nhỏ nhất là: " + min);
    }
}

//Bài 5
import java.util.Random;
        import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int totalGuesses = 0;
        int correctGuesses = 0;

        while (true) {
            System.out.println("Nhập số của bạn (hoặc nhập 'end' để kết thúc): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            int guess;

            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hoặc 'end' để kết thúc.");
                continue;
            }

            if (guess < 0 || guess > 5) {
                System.out.println("Số bạn nhập phải trong khoảng từ 0 đến 5.");
                continue;
            }

            int randomNumber = random.nextInt(6);

            System.out.println("Số máy tính đã chọn là: " + randomNumber);

            totalGuesses++;

            if (guess == randomNumber) {
                System.out.println("Bạn đoán đúng rồi!");
                score += 2;
                correctGuesses++;
            } else {
                System.out.println("Bạn đã đoán sai.");
            }
        }

        double averageScore = (double) score / totalGuesses;

        System.out.println("Kết thúc trò chơi!");
        System.out.println("Tổng điểm: " + score);
        System.out.println("Điểm trung bình: " + averageScore);
        System.out.println("Số lần đoán: " + totalGuesses);
        System.out.println("Số lần đoán đúng: " + correctGuesses);
    }
}

//Bài 6
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




