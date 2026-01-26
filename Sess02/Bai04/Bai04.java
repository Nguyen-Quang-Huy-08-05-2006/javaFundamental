import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("Nhap ma ID sach (> 0): ");
            id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Ma khong hop le, hay nhap lai");
            }
        } while (id <= 0);
        System.out.println("Luu ma sach" + id + "thanh cong");

        sc.close();
    }
}
