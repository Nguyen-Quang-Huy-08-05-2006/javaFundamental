public class Main {
    public static void main(String[] args) {
        Account acc = new Account("huy123", "123456", "huy@email.com");

        acc.hienThiThongTin();

        acc.doiMatKhau("abcdef");

        acc.hienThiThongTin();
    }
}
