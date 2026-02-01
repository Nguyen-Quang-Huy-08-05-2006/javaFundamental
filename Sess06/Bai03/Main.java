public class Main {
    public static void main(String[] args) {
        Product p = new Product("SP01", "Ban phim", 500000);

        p.hienThiThongTin();

        p.setGiaBan(-100);

        p.hienThiThongTin();

        p.setGiaBan(450000);

        p.hienThiThongTin();
    }
}
