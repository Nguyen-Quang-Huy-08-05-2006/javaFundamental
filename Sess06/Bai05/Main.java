public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("B01", "Lap trinh Java", "Nguyen Van A", 120000);
        Book b2 = new Book("B02", "Cau truc du lieu", "Tran Thi B", 150000);

        b1.hienThiThongTin();
        b2.hienThiThongTin();
    }
}
