import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: ([A-Za-z0-9]+) \\| Action: (BORROW|RETURN) \\| BookID: ([A-Za-z0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        int demBorrow = 0;
        int demReturn = 0;

        System.out.println("Nhap log tung dong (nhap 'END' de ket thuc):");

        while (true) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("END")) {
                break;
            }
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                String ngay = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);
                System.out.println("Ngay: " + ngay);
                System.out.println("User: " + user);
                System.out.println("Action: " + action);
                System.out.println("BookID: " + bookId);
                System.out.println("---------------------");

                if (action.equals("BORROW")) {
                    demBorrow++;
                } else if (action.equals("RETURN")) {
                    demReturn++;
                }
            } else {
                System.out.println("Dong log khong hop le, bo qua");
            }
        }
        System.out.println("Tong BORROW: " + demBorrow);
        System.out.println("Tong RETURN: " + demReturn);

        sc.close();
    }
}
