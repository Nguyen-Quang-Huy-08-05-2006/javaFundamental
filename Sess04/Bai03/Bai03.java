import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bai03 {
    public static void main(String[] args) {

        int soGiaoDich = 20000;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String thoiGian = LocalDateTime.now().format(dtf);

        System.out.println("So giao dich: " + soGiaoDich);

        long startString = System.currentTimeMillis();

        String baoCao1 = "Thoi gian bao cao: " + thoiGian + "\n";

        for (int i = 1; i <= soGiaoDich; i++) {
            baoCao1 = baoCao1 + "Ma sach: B" + i + " | Ngay muon: " + thoiGian + "\n";
        }

        long endString = System.currentTimeMillis();
        long timeString = endString - startString;

        long startBuilder = System.currentTimeMillis();

        StringBuilder baoCao2 = new StringBuilder();
        baoCao2.append("Thoi gian bao cao: ").append(thoiGian).append("\n");

        for (int i = 1; i <= soGiaoDich; i++) {
            baoCao2.append("Ma sach: B")
                   .append(i)
                   .append(" | Ngay muon: ")
                   .append(thoiGian)
                   .append("\n");
        }

        long endBuilder = System.currentTimeMillis();
        long timeBuilder = endBuilder - startBuilder;

        System.out.println("Thoi gian dung String (+): " + timeString + " ms");
        System.out.println("Thoi gian dung StringBuilder: " + timeBuilder + " ms");

        System.out.println("\nKet luan:");
        if (timeBuilder < timeString) {
            System.out.println("StringBuilder nhanh hon ro ret khi noi chuoi lon");
        } else {
            System.out.println("Chenh lech khong dang ke voi so giao dich hien tai");
        }
    }
}
