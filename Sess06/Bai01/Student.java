public class Student {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    public Student(String maSV, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Diem trung binh: " + diemTrungBinh);
        System.out.println("----------------------");
    }
}

