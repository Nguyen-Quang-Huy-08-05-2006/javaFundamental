public class Book {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private double gia;

    public Book(String maSach, String tenSach, String tacGia, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Gia: " + gia);
        System.out.println("----------------------");
    }
}
