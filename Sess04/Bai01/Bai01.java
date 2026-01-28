import java.util.Scanner;

public class Bai01 {

    public static String vietHoaChuCaiDau(String input) {
        input = input.trim().toLowerCase();
        String[] words = input.split("\\s+");

        String result = "";
        for (String w : words) {
            if (w.length() > 0) {
                result += w.substring(0, 1).toUpperCase() + w.substring(1) + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap the loai: ");
        String theLoai = sc.nextLine(); 
        tenSach = tenSach.trim().toUpperCase();
        tacGia = vietHoaChuCaiDau(tacGia);
        theLoai = theLoai.trim(); 

        String output = tenSach + " - Tac gia: " + tacGia;

        System.out.println("Ket qua:");
        System.out.println(output);

        sc.close();
    }
}
