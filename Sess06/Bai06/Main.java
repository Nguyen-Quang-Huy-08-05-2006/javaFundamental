public class Main {
    public static void main(String[] args) {
        User u1 = new User("U01", "huy123", "123456", "huy@email.com");
        User u2 = new User("U02", "test", "", "saiemail");

        u1.hienThiThongTin();
        u2.hienThiThongTin();

        u2.setPassword("abcdef");
        u2.setEmail("test@mail.com");

        u2.hienThiThongTin();
    }
}
