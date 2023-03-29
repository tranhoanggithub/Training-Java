package Bai2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        LocalDate dob;

        while (true) {
            try {
                System.out.print("Nhap ten: ");
                name = input.nextLine().trim();
                if (name.isEmpty()) {
                    throw new AgeException("Ten da nhap khong hop le.");
                }
                break;
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhap vao ngay sinh dinh dang (yyyy-mm-dd): ");
                dob = LocalDate.parse(input.nextLine().trim());
                LocalDate now = LocalDate.now();
                int age = now.getYear() - dob.getYear();
                if (dob.plusYears(age).isAfter(now)) {
                    age--;
                }
                if (age < 13) {
                    throw new AgeException("Tuoi phai tu 13 tro len");
                }
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Dinh dang ngay thang khong hop lê , Vui long nhap dinh dang yyyy-mm-dd.");
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Ten: " + name);
        System.out.println("Ngay sinh: " + dob);
    }
}
