import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int min = -1;
        int tong = 0;
        int demNgayMo = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhap so luot muon ngay thu " + i + ": ");
            int luotMuon = sc.nextInt();
            if (luotMuon == 0) {
                System.out.println("Ngay dong cua, khong tinh vao trung binh");
                continue;
            }
            if (demNgayMo == 0) {
                max = luotMuon;
                min = luotMuon;
            } else {
                if (luotMuon > max) {
                    max = luotMuon;
                }
                if (luotMuon < min) {
                    min = luotMuon;
                }
            }
            tong += luotMuon;
            demNgayMo++;
        }

        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);

        if (demNgayMo > 0) {
            double trungBinh = (double) tong / demNgayMo;
            System.out.println("Trung binh luot muon (cac ngay mo cua): " + trungBinh);
        } else {
            System.out.println("Khong co ngay nao mo cua de tinh trung binh");
        }

        sc.close();
    }
}
