public class Main {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};

        System.out.print("Danh sach diem: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double avg = ScoreUtils.calculateAverage(scores);

        System.out.println(">> Ket qua xu ly:");
        System.out.println("- Diem trung binh ca lop: " + String.format("%.2f", avg));

        for (double s : scores) {
            System.out.println("- Diem " + s + ": " + (ScoreUtils.checkPass(s) ? "Dat" : "Truot"));
        }
    }
}
