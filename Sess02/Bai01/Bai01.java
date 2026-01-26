import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhap so sach dang muon: ");
        int soSach = sc.nextInt();

        if (tuoi >= 18 && soSach < 3) {
            System.out.println("Cho phep muon sach");
        } else {
            if (tuoi < 18 ) {
                System.out.println("Ban chua du tuoi");
            } else if(soSach >= 3) {
                System.out.println("Ban da muon qua so luong sach");
            }
        }

        sc.close();
    }
}
