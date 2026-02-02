public class Main {
    public static void main(String[] args) {
        double diem = 8.5;

        System.out.println("Diem hien tai: " + diem);
        System.out.println("Diem toi da: " + Config.MAX_SCORE);
        System.out.println("Diem toi thieu: " + Config.MIN_SCORE);

        if (diem <= Config.MAX_SCORE && diem >= Config.MIN_SCORE) {
            System.out.println("Diem hop le");
        } else {
            System.out.println("Diem khong hop le");
        }

    }
}
