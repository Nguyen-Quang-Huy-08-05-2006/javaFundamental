import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma the thu vien: ");
        String maThe = sc.nextLine().trim();

        String regex = "^[A-Z]{2}\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(maThe);

        if (matcher.matches()) {
            System.out.println("Ma the hop le");
        } else {
            if (!maThe.matches("^[A-Z]{2}.*")) {
                System.out.println("Thieu tien to 2 chu in hoa (vi du: TV)");
            } else if (!maThe.matches("^[A-Z]{2}\\d{4}.*")) {
                System.out.println("Nam khong hop le (can 4 chu so)");
            } else if (!maThe.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
                System.out.println("Thieu 5 chu so o cuoi ma the");
            } else {
                System.out.println("Dinh dang ma the khong hop le");
            }
        }

        sc.close();
    }
}
