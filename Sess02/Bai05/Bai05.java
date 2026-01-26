import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diem = 100;
        int ngayTre;

        System.out.println("Nhap so ngay tre tung lan (nhap 999 de ket thuc):");

        while (true) {
            System.out.print("Nhap so ngay: ");
            ngayTre = sc.nextInt();
            if (ngayTre == 999) {
                break;
            }
            if (ngayTre <= 0) {
                diem += 5;
                System.out.println("Tra dung han, +5 diem");
            } else {
                int tru = ngayTre * 2;
                diem -= tru;
                System.out.println("So ngay tra muon: " + ngayTre);
                System.out.println("Tra muon, -" + tru + " diem");
            }
        }

        System.out.println("Tong diem uy tin: " + diem);

        if (diem > 120) {
            System.out.println("Diem: " + diem + " - Xep loai: Doc gia Than thiet");
        } else if (diem >= 80) {
            System.out.println("Diem: " + diem + " - Xep loai: Doc gia Tieu chuan");
        } else {
            System.out.println("Diem: " + diem + " - Xep loai: Doc gia can luu y");
        }

        sc.close();
    }
}
