public class ClassRoom {
    private String tenSinhVien;
    private static double classFund = 0;

    public ClassRoom(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void dongTien(double soTien) {
        if (soTien > 0) {
            classFund += soTien;
            System.out.println(tenSinhVien + " dong " + soTien + " vao quy lop");
        } else {
            System.out.println("So tien khong hop le");
        }
    }

    public static void xemQuyLop() {
        System.out.println("Tong quy lop: " + classFund);
        System.out.println("----------------------");
    }
}
