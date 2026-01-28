import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai06 {

    public static String taoSao(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] blacklist = {"xau", "te", "cam", "bad", "hate"};
        System.out.print("Nhap danh gia sach: ");
        String review = sc.nextLine();

        for (String tuCam : blacklist) {
            String regex = "(?i)\\b" + Pattern.quote(tuCam) + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(review);

            StringBuffer result = new StringBuffer();

            while (matcher.find()) {
                String sao = taoSao(matcher.group().length());
                matcher.appendReplacement(result, sao);
            }
            matcher.appendTail(result);

            review = result.toString();
        }
        int MAX_LENGTH = 200;

        if (review.length() > MAX_LENGTH) {
            String sub = review.substring(0, MAX_LENGTH);

            int lastSpace = sub.lastIndexOf(" ");
            if (lastSpace != -1) {
                sub = sub.substring(0, lastSpace);
            }

            StringBuilder sb = new StringBuilder();
            sb.append(sub).append("...");
            review = sb.toString();
        }
        System.out.println("\nDanh gia sau khi xu ly:");
        System.out.println(review);

        sc.close();
    }
}
