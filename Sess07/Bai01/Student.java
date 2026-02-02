public class Student {
    private String maSV;
    private String tenSV;

    private static int totalStudent = 0;

    public Student(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        totalStudent++;
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ten SV: " + tenSV);
        System.out.println("----------------------");
    }

    public static void hienThiTongSo() {
        System.out.println("Tong so sinh vien: " + totalStudent);
    }
}
