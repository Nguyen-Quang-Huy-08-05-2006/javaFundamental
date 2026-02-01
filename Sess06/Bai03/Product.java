public class Product {
    private String maSP;
    private String tenSP;
    private double giaBan;

    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan);
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Gia khong hop le, phai > 0");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma SP: " + maSP);
        System.out.println("Ten SP: " + tenSP);
        System.out.println("Gia ban: " + giaBan);
        System.out.println("----------------------");
    }
}
