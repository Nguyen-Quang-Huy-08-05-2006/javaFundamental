public class Employee {
    private String maNV;
    private String tenNV;
    private double luong;

    public Employee() {
        this.maNV = "Chua co";
        this.tenNV = "Chua co";
        this.luong = 0;
    }

    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }

    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ten NV: " + tenNV);
        System.out.println("Luong: " + luong);
        System.out.println("----------------------");
    }
}
