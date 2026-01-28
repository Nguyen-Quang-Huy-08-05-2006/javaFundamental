import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap doan mo ta sach: ");
        String moTa = sc.nextLine();

        String keyword = "Ke:";

        if (moTa.contains(keyword)) {
            int start = moTa.indexOf(keyword) + keyword.length();

            int end = moTa.indexOf(",", start);
            if (end == -1) {
                end = moTa.length();
            }
            String viTri = moTa.substring(start, end).trim();
            System.out.println("Ma vi tri ke sach: " + viTri);

            String moTaMoi = moTa.replace(keyword, "Vi tri luu tru:");
            System.out.println("Mo ta moi:");
            System.out.println(moTaMoi);
        } else {
            System.out.println("Khong tim thay tu khoa 'Ke:' trong mo ta");
        }

        sc.close();
    }
}
